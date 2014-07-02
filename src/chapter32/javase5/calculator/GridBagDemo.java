package chapter32.javase5.calculator;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class GridBagDemo extends JFrame {
    public GridBagDemo() {
        super("GridBagDemo");
        setSize(800, 600);

        JDesktopPane desktop = new JDesktopPane();
        getContentPane().add(desktop);

        /**
         * Default Behavior
         */
        JInternalFrame dft = new JInternalFrame("Default Behavior", true, true);
        dft.setBounds(5, 5, 300, 140);
        Container contentPane = dft.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        contentPane.add(new JButton("Wonderful"));
        contentPane.add(new JButton("World"));
        contentPane.add(new JButton("Of"));
        contentPane.add(new JButton("Swing!!!"));
        desktop.add(dft, 0);
        dft.show();

        /**
         * gridx, ipadx, insets
         */
        JInternalFrame gridx_ipadx_insets = new JInternalFrame(
                "gridx_ipadx_insets", true, true);
        gridx_ipadx_insets.setBounds(5, 150, 300, 140);
        contentPane = gridx_ipadx_insets.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints constrains = new GridBagConstraints();
        //constrains.insets = new Insets(2, 2, 2, 2);
        constrains.gridx = 0;// column 0
        constrains.gridy = 0;// row 0
        constrains.ipadx = 5;// Increase component width by 10 pixels
        constrains.ipady = 5;// Increase component height by 10 pixels
        contentPane.add(new JButton("Wonderful"), constrains);

        constrains.gridx = 1;
        constrains.ipadx = 0;// Reset the padding to 0
        constrains.ipady = 0;// Increase component height by 10 pixels
        contentPane.add(new JButton("World"), constrains);

        constrains.gridx = 0;// column 0
        constrains.gridy = 1;// row 1
        contentPane.add(new JButton("Of"), constrains);

        constrains.gridx = 1;// column 1
        contentPane.add(new JButton("Swing!!!"), constrains);

        desktop.add(gridx_ipadx_insets, 1);
        gridx_ipadx_insets.show();

        /**
         * weightx
         */
        JInternalFrame weightx_weighty = new JInternalFrame("weightx", true,
                true);
        weightx_weighty.setBounds(5, 295, 300, 140);
        contentPane = weightx_weighty.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        constrains = new GridBagConstraints();
        //constrains.insets = new Insets(2, 2, 2, 2);
        constrains.weightx = 1.0;
        constrains.weighty = 1.0;
        constrains.gridx = 0;// column 0
        constrains.gridy = 0;// row 0
        contentPane.add(new JButton("Wonderful"), constrains);

        constrains.gridx = 1;// column 1
        contentPane.add(new JButton("World"), constrains);

        constrains.gridx = 0;// column 0
        constrains.gridy = 1;// row 1

        contentPane.add(new JButton("Of"), constrains);

        constrains.gridx = 1;// column 1
        contentPane.add(new JButton("Swing!!!"), constrains);
        desktop.add(weightx_weighty, 2);
        weightx_weighty.show();

        /**
         * gridwidth, occupy more column
         */
        JInternalFrame gridwidth_occupyMoreColumn = new JInternalFrame(
                "gridwidth_occupyMoreColumn", true, true);
        gridwidth_occupyMoreColumn.setBounds(350, 5, 300, 140);
        contentPane = gridwidth_occupyMoreColumn.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        constrains = new GridBagConstraints();

        //constrains.insets = new Insets(2, 2, 2, 2);
        constrains.gridx = 0;
        constrains.gridy = 0;
        constrains.weightx = 1.0;
        constrains.weighty = 1.0;
        constrains.gridheight = 2;// Span accross 2 row
        contentPane.add(new JButton("Wonderful"), constrains);

        constrains.gridx = 1;
        constrains.gridheight = 1;// Remember to set back to 1 row
        constrains.gridwidth = 2;// Span accross 2 column
        contentPane.add(new JButton("World"), constrains);

        constrains.gridy = 1;
        constrains.gridwidth = 1;// Remember to set back to 1 column
        contentPane.add(new JButton("Of"), constrains);

        constrains.gridx = 2;
        contentPane.add(new JButton("Swing!!!"), constrains);
        desktop.add(gridwidth_occupyMoreColumn, 3);
        gridwidth_occupyMoreColumn.show();

        /**
         * ancher in a cell
         */
        JInternalFrame ancher_in_cell_position = new JInternalFrame(
                "ancher_in_cell_position", true, true);
        ancher_in_cell_position.setBounds(350, 150, 300, 140);
        contentPane = ancher_in_cell_position.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        constrains = new GridBagConstraints();
        //constrains.insets = new Insets(2, 2, 2, 2);
        constrains.weightx = 1.0;
        constrains.weighty = 1.0;
        constrains.gridx = 0;
        constrains.gridy = 0;
        constrains.gridheight = 2;
        constrains.anchor = GridBagConstraints.NORTH;
        contentPane.add(new JButton("Wonderful"), constrains);

        constrains.gridx = 1;
        constrains.gridheight = 1;
        constrains.gridwidth = 2;
        constrains.anchor = GridBagConstraints.SOUTHWEST;
        contentPane.add(new JButton("World"), constrains);

        constrains.gridy = 1;
        constrains.gridwidth = 1;
        constrains.anchor = GridBagConstraints.CENTER;
        contentPane.add(new JButton("Of"), constrains);

        constrains.gridx = 2;
        contentPane.add(new JButton("Swing!!!"), constrains);
        desktop.add(ancher_in_cell_position, 4);
        ancher_in_cell_position.show();

        /**
         * fill in a cell
         */
        JInternalFrame fill_the_cell = new JInternalFrame("fill_the_cell",
                true, true);
        fill_the_cell.setBounds(350, 295, 300, 140);
        contentPane = fill_the_cell.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        constrains = new GridBagConstraints();
        //constrains.insets = new Insets(2, 2, 2, 2);
        constrains.weightx = 1.0;
        constrains.weighty = 1.0;
        constrains.gridx = 0;
        constrains.gridy = 0;
        constrains.gridheight = 2;
        constrains.fill = GridBagConstraints.BOTH;
        contentPane.add(new JButton("Wonderful"), constrains);

        constrains.gridx = 1;
        constrains.gridheight = 1;
        constrains.gridwidth = 2;
        constrains.fill = GridBagConstraints.HORIZONTAL;
        contentPane.add(new JButton("World"), constrains);

        constrains.gridy = 1;
        constrains.gridwidth = 1;
        constrains.fill = GridBagConstraints.NONE;
        contentPane.add(new JButton("Of"), constrains);

        constrains.gridx = 2;
        constrains.fill = GridBagConstraints.VERTICAL;
        contentPane.add(new JButton("Swing!!!"), constrains);
        desktop.add(fill_the_cell, 5);
        fill_the_cell.show();
        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);
        setVisible(true);
    }

    public static void main(String argv[]) {
        new GridBagDemo();
    }
}
