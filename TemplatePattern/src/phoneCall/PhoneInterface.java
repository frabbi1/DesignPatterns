package phoneCall;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PhoneInterface {
	private JFrame frame;
	private JButton gp, blink, ttalk, calling;
	private JTextField txt;
	private Operator operator;
	private JButton endCall;
	private long start, end;
	public PhoneInterface() {
		initialize();
	}
	
	public void initialize() {
		frame  = new JFrame("Phone call");
		frame.setBounds(300,20,405,600);
		frame.getContentPane().setBackground(new Color(9, 69, 81));
		frame.getContentPane().setLayout(null);
		
		txt = new JTextField();
		txt.setBounds(10, 11, 379, 101);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		gp = new JButton("GP");
		gp.setBounds(20, 132, 114, 82);
		frame.getContentPane().add(gp);
		gp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				doGPAction();
			}
		});
		
		blink = new JButton("Banglalink");
		blink.setBounds(144, 132, 111, 82);
		frame.getContentPane().add(blink);
		blink.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				doBLAction();
			}
		});
		
		ttalk = new JButton("Teletalk");
		ttalk.setBounds(265, 132, 114, 82);
		frame.getContentPane().add(ttalk);
		ttalk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				doTTAction();
			}
		});
		
		calling = new JButton("Call");
		calling.setBounds(31, 236, 335, 44);
		calling.setEnabled(false);
		frame.getContentPane().add(calling);
		
		endCall = new JButton("End Call");
		endCall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doEndCallAction();
			}
		});
		endCall.setEnabled(false);
		endCall.setBounds(31, 293, 335, 44);
		frame.getContentPane().add(endCall);
		calling.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doCallingAction();
				
			}
		});
		
		frame.setResizable(false);
		
	}
	public void show() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void doGPAction() {
		operator = new GrameenPhone();
		gp.setBackground(Color.green);
		calling.setEnabled(true);
		blink.setEnabled(false);
		ttalk.setEnabled(false);
		
	}
	public void doBLAction() {
		operator = new Banglalink();
		blink.setBackground(Color.green);
		calling.setEnabled(true);
		gp.setEnabled(false);
		ttalk.setEnabled(false);
	}
	public void doTTAction() {
		operator = new Teletalk();
		ttalk.setBackground(Color.green);
		calling.setEnabled(true);
		gp.setEnabled(false);
		blink.setEnabled(false);
		
	}
	
	public void doCallingAction() {
		calling.setEnabled(false);
		endCall.setEnabled(true);
		endCall.setBackground(Color.red);
		txt.setText("Calling...");
		start = System.nanoTime();
		
	}
	public void doEndCallAction() {
		endCall.setEnabled(false);
		end  = System.nanoTime();
		operator.setTime(start,end);
		double cost = operator.calculateCallCost();
		txt.setText("Call Cost: " + cost + " taka\n");
		
		
	}
}
