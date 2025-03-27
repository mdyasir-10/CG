import java.awt.*;
import java.awt.event.*;

class ActEvent extends Frame implements ActionListener
{
	TextField tf;
	ActEvent(){
		tf = new TextField();
		tf.setBounds(60,50,170,20);
		Button b= new Button("Click ME");
		b.setBounds(100,120,80,30);
		b.addActionLister(this);
		add(b); add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

	public static void ActionPerfomed(ActionEvent e){
		tf.setText("Welcome");
	}
	public static void main(String[] args){
		new ActEvent();
	}

}