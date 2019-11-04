import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements MouseListener {
	JFrame frame;
	JPanel panel;
	JButton fun;
	JTextField field;
	JLabel label;
	public static void main(String[] args) {
		Binary_Converter converter = new Binary_Converter();
		converter.Setup();
	}
	public void Setup(){
		frame = new JFrame();
		 panel = new JPanel();
		 frame. add(panel);
		 fun = new JButton("change");
		fun.addMouseListener(this);
		panel.add(fun);
		field = new JTextField(24);
		panel.add(field);
		label = new JLabel("output");
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		
	}
	
String convert(String input) {
    if(input.length() != 8){
       JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
       return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()== fun) {
			label.setText(convert(field.getText()));
			field.setText(null);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
//You will need a JFrame and a JPanel. The input field will be a JTextField, the output can be a JLabel as it is only used for display.

//Make the text field nice and big, ex. JTextField answer = new JTextField(20);

//You will also need to add a mouse listener to the JButton so you know when to do the conversion. 

//Here is a method that will convert a String of binary digits to a String containing the equivalent ASCII character.


                              