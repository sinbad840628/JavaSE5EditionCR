/**
 * 
 */
package chapter32.javase5.download;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Observable;

/**
 * @author 344189
 * 
 */
public class Download extends Observable implements Runnable {

	private static final int MAX_BUFFER_SIZE = 1024;

	public static final String STATUSES[] = { "Downloading", "Paused",
			"Complete", "Cancelled", "Error" };

	public static final int DOWNLOADING = 0;
	public static final int PAUSED = 1;
	public static final int COMPLETE = 2;
	public static final int CANCELLED = 3;
	public static final int ERROR = 4;

	private URL url;
	public int size;
	public int downloaded;
	public int status;

	public Download(URL url) {
		this.url = url;
		size = -1;
		downloaded = 0;
		status = DOWNLOADING;
		download();
	}

	public String getUrl() {
		return url.toString();
	}

	public int getSize() {
		return size;
	}

	public float getProcess() {
		return ((float) downloaded / size) * 100;
	}

	public int getStatus() {
		return status;
	}

	public void pause() {
		status = PAUSED;
		stateChanged();
	}

	public void resume() {
		status = DOWNLOADING;
		stateChanged();
		download();
	}

	public void cancel() {
		status = CANCELLED;
		stateChanged();
	}

	public void error() {
		status = ERROR;
		stateChanged();
	}

	public void download() {
		Thread thread = new Thread(this);
		thread.start();
	}

	private String getFileName(URL url) {
		String fileName = url.getFile();
		return fileName.substring(fileName.lastIndexOf('/'), 1);
	}

	public void stateChanged() {
		setChanged();
		notifyObservers();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		RandomAccessFile file = null;
		InputStream stream = null;
		try {
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestProperty("Range", "bytes = " + downloaded+ "-");
			connection.connect();

			if (connection.getResponseCode() / 100 != 2) {
				error();
			}
			int contentLength = connection.getContentLength();
			if (contentLength < 1) {
				error();
			}

			if (size == -1) {
				size = contentLength;
				stateChanged();
			}

			file = new RandomAccessFile(getFileName(url), "rw");
			file.seek(downloaded);
			stream = connection.getInputStream();
			while (status == DOWNLOADING) {
				byte buffer[];
				if (size - downloaded > MAX_BUFFER_SIZE) {
					buffer = new byte[MAX_BUFFER_SIZE];
				} else {
					buffer = new byte[size - downloaded];
				}

				int read = stream.read(buffer);
				if (read == -1) {
					break;
				}

				file.write(buffer, 0, read);
				downloaded += read;
				stateChanged();

			}// end of while

			if (status == DOWNLOADING) {
				status = COMPLETE;
				stateChanged();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}// end of if

			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}