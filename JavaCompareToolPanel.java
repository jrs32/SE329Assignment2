package pkg;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JavaCompareToolPanel extends JPanel {

	// Declare Panel Components
	private static JTextField fileAfield;
	private static JTextField fileBfield;
	private static JButton openA; 
	private static JButton openB; 
	private static JButton run; 
	JPanel backgroundPanel;
	private static JFileChooser fileChooser;
	
	// Create the Panel to Display
	public JavaCompareToolPanel(){
		
		// Create filename fields
		fileAfield = new JTextField("Enter First Filename");
		fileBfield = new JTextField("Enter Second Filename");		
		fileAfield.setPreferredSize(new Dimension(350, 20));
		fileBfield.setPreferredSize(new Dimension(350, 20));
		
		// Create Browse and Run buttons
		openA = new JButton("Browse..");
		openB = new JButton("Browse..");
		run = new JButton("Run");
		
		// Add ActionListener to the Browse buttons to open a FileChooser
		BrowseListener bl = new BrowseListener();
		openA.addActionListener(bl);
		openB.addActionListener(bl);
		
		// Add an ActionListener to the run button 
		runListener rl = new runListener();
		run.addActionListener(rl);

		// Create the panel and add components
		backgroundPanel = new JPanel();
		backgroundPanel.setPreferredSize( new Dimension( 460, 120 ) );
		backgroundPanel.add(fileAfield);
		backgroundPanel.add(openA);
		backgroundPanel.add(fileBfield);
		backgroundPanel.add(openB);
		backgroundPanel.add(run);
		
	}
	
	// Listener for the Browse Buttons
	public class BrowseListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
					
			// Chooser for File A
			if(arg0.getSource() == openA){	
				fileChooser = new JFileChooser();
				int val = fileChooser.showOpenDialog(backgroundPanel);	
				if(val == JFileChooser.APPROVE_OPTION){
					fileAfield.setText(fileChooser.getSelectedFile().getAbsolutePath());
				}
			}
					
			// Chooser for File B
			else if (arg0.getSource() == openB){	
				fileChooser = new JFileChooser();
				int val = fileChooser.showOpenDialog(backgroundPanel);	
				if(val == JFileChooser.APPROVE_OPTION){
					fileBfield.setText(fileChooser.getSelectedFile().getAbsolutePath());
				}
			}
		}
	} // End BrowseListener
	
	
	// This function runs when the "run" button is clicked.
	public class runListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			
			String fileA = fileAfield.getText().trim();
			String fileB = fileBfield.getText().trim();
			
			System.out.println("File A = " + fileA);
			System.out.println("File B = " + fileB);
			
		}
	} // End runListener

}
