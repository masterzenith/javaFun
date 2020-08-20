import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
	public static void main(String[] args){
		Frame f = new Frame("Button Example");
		final TextField tf = new TextField();
		tf.setBounds(300,100,60,50);
		Button b = new Button("Click Here");
		b.setBounds(200,100,80,50);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				tf.setText("Welcome to JavaTPoint");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
