

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


import java.awt.FlowLayout;

public class FlyweightImplementation extends JPanel {

	public static JFrame frame;
	Color[] shapeColor = { Color.orange, Color.red, Color.yellow,
						Color.blue, Color.pink, Color.cyan, Color.green, 
						Color.magenta, Color.black, Color.gray };
	
	public FlyweightImplementation() {
		setLayout(null);	
		setBackground(Color.black);
		
		
		
		JButton btnDraw = new JButton("Draw Lines");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics g = getGraphics();
				long startTime = System.currentTimeMillis();
		
				for(int i = 0; i < 100000; i++) {
						Random randomGenerator = new Random();						
						int randInt = randomGenerator.nextInt(5);
						int x1 = randomGenerator.nextInt(500);
						int y1 = randomGenerator.nextInt(500);
						int x2 = randomGenerator.nextInt(500);
						int y2 = randomGenerator.nextInt(500);
						Line line = LineFactory.getLine(shapeColor[randInt]);
		                line.draw(g, x1, y1, x2, y2);
		           
				}
				
				long finishTime = System.currentTimeMillis();
				System.out.println("Time Elapsed (FlyWeight): " + (finishTime - startTime) + " miliseconds");
				
			}
		});
		btnDraw.setFont(new Font("Arial", Font.BOLD, 16));
		btnDraw.setForeground(new Color(0, 0, 128));
		btnDraw.setBounds(200, 320, 178, 32);
		add(btnDraw);

	}
	
	public static void main(String[] args) {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    frame = new JFrame("FLYWEIGHT Pattern");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBackground(Color.black);
	    frame.setSize(580, 400);
	 
	    FlyweightImplementation panel = new FlyweightImplementation();
	 
	    frame.add(panel);
	 
	    frame.setVisible(true);
	  }
}
