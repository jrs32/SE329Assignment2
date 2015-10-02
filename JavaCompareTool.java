package pkg;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JavaCompareTool {
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("Java Compare Tool");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new JavaCompareToolPanel().backgroundPanel);
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
