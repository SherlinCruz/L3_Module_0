package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.omg.CORBA.portable.ValueInputStream;

public class LogSearch implements ActionListener {
	/*
	 * Button 1: Add Entry When this button is clicked, use an input dialog to ask
	 * the user to enter an ID number. After an ID is entered, use another input
	 * dialog to ask the user to enter a name. Add this information as a new entry
	 * to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	// int idNumber;
	// String name;
	// int searchId;
	// String searchName;

	HashMap<Integer, String> values = new HashMap<Integer, String>();

	public static void main(String[] args) {
		LogSearch LogSearch = new LogSearch();

	}

	LogSearch() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		frame.setVisible(true);
		panel.setVisible(true);
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);

		button1.setText("Add id & name");
		button2.setText("Search id & name");
		button3.setText("Show List");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {
			String id = JOptionPane.showInputDialog("Enter an id.");

			int idNumber = Integer.parseInt(id);

			String name = JOptionPane.showInputDialog("Enter a name.");

			values.put(idNumber, name);

		} else if (e.getSource().equals(button2)) {
			String searchId = JOptionPane.showInputDialog("Enter an id number.");

			int searchIdNumber = Integer.parseInt(searchId);

			String searchName = JOptionPane.showInputDialog("Enter a name.");

			
			
	/*		
			if (values.containsKey(searchIdNumber)) {

				values.get(searchId);
				System.out.println(searchId);
				
				
				if (values.containsKey(searchName)) {
					//values.get(name);

					System.out.println(searchName);
					
				}

			}*/

			else {
				System.out.println("entry does not exist.");
			}
		}

	}
}
