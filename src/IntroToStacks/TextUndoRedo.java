package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel:D
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor:D
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	Stack<Character> character = new Stack<Character>();

	public static void main(String[] args) {
		TextUndoRedo textUndoRedo = new TextUndoRedo();

	}

	TextUndoRedo() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		panel.setVisible(true);
		label.setVisible(true);
		label.setText("Text: ");
		frame.addKeyListener(this);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

			String erase = label.getText();

			character.push(erase.charAt(erase.length() - 1));

			String newString = erase.substring(0, erase.length() - 1);

			label.setText(newString);

		} else if (e.getKeyCode() == KeyEvent.VK_A) {

			// when that key is pressed, the top Character is popped off the Stack and added
			// back to the JLabel.

			int size = character.size();

			for (int i = 0; i < size; i--) {
				Character oldVariable = character.pop();
			}
		} else {

			String v = label.getText();

			v += e.getKeyChar();

			label.setText(v);

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}