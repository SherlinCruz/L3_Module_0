package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name.
	// Add that name to an ArrayList.
	// When the "View Names" button is clicked, display a message dialog that
	// displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton AddName = new JButton();
	JButton ViewNames = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook guestBook = new GuestBook();
		ArrayList<Integer> numbers = new ArrayList<Integer>();

	}

	GuestBook() {
		frame.setVisible(true);
		panel.setVisible(true);
		frame.add(panel);
		panel.add(AddName);
		panel.add(ViewNames);
		AddName.setVisible(true);
		ViewNames.setVisible(true);
		AddName.setText("Add Name");
		ViewNames.setText("View Names");
		AddName.addActionListener(this);
		ViewNames.addActionListener(this);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(AddName)) {

			String nameAdded = JOptionPane.showInputDialog(null, " Enter a name ");
			names.add(nameAdded);

		}

		if (e.getSource().equals(ViewNames)) {

			String s = " ";
			for (int i = 0; i < names.size(); i++) {

				String l = names.get(i);

				s += " Guest # " + (i + 1) + "  " + l + " \n ";

			}
			JOptionPane.showMessageDialog(null, s);
		}

	}

}