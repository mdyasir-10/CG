import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample{
	public static void main(String[] args){
		JFrame frame = new JFrame("Border Layout Example");
		frame.setLayout(new BorderLayout());
		
		frame.add(new JButton("North"), BorderLayout.NORTH);
		frame.add(new JButton("Sout"), BorderLayout.SOUTH);
		frame.add(new JButton("East"), BorderLayout.EAST);
		frame.add(new JButton("West"), BorderLayout.WEST);
		frame.add(new JButton("Center"), BorderLayout.CENTER);
		
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}