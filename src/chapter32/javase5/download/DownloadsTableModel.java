package chapter32.javase5.download;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JProgressBar;
import javax.swing.table.AbstractTableModel;

public class DownloadsTableModel extends AbstractTableModel implements Observer {

	private static final String[] columnNames = {"URL","Size","progress","Status"};
	
	private static final Class[] columnClasses = {String.class,String.class,JProgressBar.class,String.class};
	
	private ArrayList<Download> downloadList = new ArrayList<Download>();
	
	public void addDownload(Download download){
		download.addObserver(this);
		downloadList.add(download);
		fireTableRowsInserted(getRowCount() -1, getRowCount() -1);
	}
	
	public Download getDownload(int row){
		return downloadList.get(row);
	}
	
	public void clearDownload(int row){
		downloadList.remove(row);
		fireTableRowsDeleted(row, row);
	}
	
	@Override
	public int getRowCount() {
		return downloadList.size();
	}

	public String getColumnName(int col){
		return columnNames[col];
	}
	
	public Class getColumnClass(int col){
		return columnClasses[col];
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		Download download = downloadList.get(row);
		switch (col) {
		case 0:
			return download.getUrl();
		case 1:
			int size = download.getSize();
			return (size == -1 ) ? "": Integer.toString(size);
		case 2:
			return new Float(download.getProcess());
		case 3:
			return Download.STATUSES[download.getStatus()];
		}
		
		return "";
	}

	@Override
	public void update(Observable o, Object arg) {
		int index = downloadList.indexOf(o);
		fireTableRowsUpdated(index, index);
	}

}
