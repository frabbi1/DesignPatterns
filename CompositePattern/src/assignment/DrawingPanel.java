package assignment;


import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawingPanel extends JFrame{
	
	Graphics2D g2d;
	JPanel panel1;
	int H = 700;
	Color dflt = new Color(240, 240, 240);
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtW;
	private JTextField txtH;
	private int x,y,x2,y2;
	Boolean l,r,c,f;
	public DrawingPanel() {
		l=false;
		r=false;
		c=false;
		f=false;
		setTitle("DrawComp");
		setBackground(new Color(72, 61, 139));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10,10,1000,H);
		setResizable(false);
		//getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		addPanels();
		setVisible(true);
	}
	

	
	public void addPanels() {
		
		getContentPane().setLayout(null);
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setSize(600,H);
		panel1.repaint();
		panel1.setBackground(new Color(211, 211, 211));
		getContentPane().add(panel1);
		
		//g2d.drawLine(40,40,60,60);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(600,0,400,H);
		panel2.setBackground(Color.black);
		addPanel2Elements(panel2);
		getContentPane().add(panel2);
		
		
	
		
	}
	public void addPanel2Elements(JPanel panel2) {
		JButton line = new JButton("Line");
		
		JButton rect = new JButton("Rectangle");
		JButton circle = new JButton("Circle");
		
		line.setBounds(37, 33, 80, 50);
		rect.setBounds(141, 33, 112, 50);
		circle.setBounds(274, 33, 80, 50);
		
		panel2.add(line);
		panel2.add(rect);
		panel2.add(circle);
		JButton flag = new JButton("Flag");
		flag.setBounds(37, 107, 80, 50);
		panel2.add(flag);
		
		txtX = new JTextField();
		txtX.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtX.setBounds(24, 279, 119, 33);
		txtX.setVisible(false);
		panel2.add(txtX);
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtY.setBounds(243, 279, 119, 33);
		txtY.setVisible(false);
		panel2.add(txtY);
		txtY.setColumns(10);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblX.setForeground(Color.WHITE);
		lblX.setBounds(71, 254, 46, 14);
		lblX.setVisible(false);
		panel2.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setForeground(Color.WHITE);
		lblY.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblY.setBounds(292, 254, 46, 14);
		lblY.setVisible(false);
		panel2.add(lblY);
		
		JLabel lblHeight = new JLabel("height");
		lblHeight.setForeground(Color.WHITE);
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHeight.setBounds(266, 361, 72, 20);
		lblHeight.setVisible(false);
		panel2.add(lblHeight);
		
		JLabel lblW = new JLabel("width");
		lblW.setForeground(Color.WHITE);
		lblW.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblW.setBounds(51, 361, 72, 20);
		lblW.setVisible(false);
		panel2.add(lblW);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.ORANGE);
		separator.setBounds(37, 211, 317, 2);
		panel2.add(separator);
		
		txtW = new JTextField();
		txtW.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtW.setColumns(10);
		txtW.setBounds(24, 392, 119, 33);
		txtW.setVisible(false);
		panel2.add(txtW);
		
		txtH = new JTextField();
		txtH.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtH.setColumns(10);
		txtH.setBounds(243, 392, 119, 33);
		txtH.setVisible(false);
		panel2.add(txtH);
		
		JButton draw = new JButton("DRAW");
		draw.setBackground(new Color(230, 230, 250));
		draw.setVisible(false);
		draw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		draw.setBounds(152, 472, 94, 50);
		panel2.add(draw);
		line.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				init();
				g2d = (Graphics2D)panel1.getGraphics();
				draw.setVisible(true);
				lblHeight.setVisible(true);
				lblW.setVisible(true);
				lblX.setVisible(true);
				lblY.setVisible(true);
				txtH.setVisible(true);
				txtW.setVisible(true);
				txtX.setVisible(true);
				txtY.setVisible(true);
				lblHeight.setText("y2");
				lblW.setText("x2");
				
				
				
				line.setBackground(Color.GREEN);
				rect.setBackground(dflt);
				flag.setBackground(dflt);
				circle.setBackground(dflt);
				l=true;
				r=false;
				c=false;
				f=false;
				//g2d.drawLine(7, 7, 500, 500);
				//repaint();
			}
		});
		rect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				init();
				g2d = (Graphics2D)panel1.getGraphics();
				draw.setVisible(true);
				lblHeight.setVisible(true);
				lblW.setVisible(true);
				lblW.setText("width");
				lblHeight.setText("height");
				lblX.setVisible(true);
				lblY.setVisible(true);
				txtH.setVisible(true);
				txtW.setVisible(true);
				txtX.setVisible(true);
				txtY.setVisible(true);
				line.setBackground(dflt);
				rect.setBackground(Color.GREEN);
				flag.setBackground(dflt);
				circle.setBackground(dflt);
				
				l=false;
				r=true;
				c=false;
				f=false;
				//g2d.fillRect(20, 20, 60, 60);
				//repaint();
			}
		});
		circle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				init();
				
				draw.setVisible(true);
				lblHeight.setVisible(false);
				lblW.setVisible(true);
				lblW.setText("radius");
				lblX.setVisible(true);
				lblY.setVisible(true);
				txtH.setVisible(false);
				txtW.setVisible(true);
				txtX.setVisible(true);
				txtY.setVisible(true);
				line.setBackground(dflt);
				rect.setBackground(dflt);
				flag.setBackground(dflt);
				circle.setBackground(Color.GREEN);
				l=false;
				r=false;
				c=true;
				f=false;
			}
		});
		flag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				init();
				draw.setVisible(true);
				lblHeight.setVisible(true);
				lblW.setVisible(true);
				lblX.setVisible(true);
				lblY.setVisible(true);
				txtH.setVisible(true);
				txtW.setVisible(true);
				txtX.setVisible(true);
				txtY.setVisible(true);
				lblW.setText("width");
				line.setBackground(dflt);
				rect.setBackground(dflt);
				flag.setBackground(Color.GREEN);
				circle.setBackground(dflt);
				l=false;
				r=false;
				c=false;
				f=true;
			}
		});
		draw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(l) {
					x=Integer.parseInt(txtX.getText());
					y=Integer.parseInt(txtY.getText());
					x2=Integer.parseInt(txtW.getText());
					y2=Integer.parseInt(txtH.getText());
					IShape lineObj = new Line(x,y,x2,y2);
					lineObj.draw(g2d);
				}
				else if(r) {
					x=Integer.parseInt(txtX.getText());
					y=Integer.parseInt(txtY.getText());
					x2=Integer.parseInt(txtW.getText());
					y2=Integer.parseInt(txtH.getText());
					IShape rectangle = new Rectangle(x,y,x2,y2);
					rectangle.draw(g2d);
				}
				else if(c) {
					x=Integer.parseInt(txtX.getText());
					y=Integer.parseInt(txtY.getText());
					x2=Integer.parseInt(txtW.getText());

					IShape cir = new Circle(x2,x,y);
					cir.draw(g2d);
				}
				else {
					x=Integer.parseInt(txtX.getText());
					y=Integer.parseInt(txtY.getText());
					x2=Integer.parseInt(txtW.getText());
					y2=Integer.parseInt(txtH.getText());
					IShape flg = new Flag(x,y,x2,y2);
					flg.draw(g2d);
				}
			}
		});
		
	}
	public void init() {
		
		panel1.removeAll();
		revalidate();
		//repaint();
		g2d = (Graphics2D)panel1.getGraphics();
		
		
	}
	
	
}
