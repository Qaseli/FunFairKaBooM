import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtPassword;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket frame = new Ticket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ticket() {
		setTitle("Personal Info");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("Personall ID :");
		lblID.setFont(new Font("Source Code Pro Semibold", Font.PLAIN, 15));
		lblID.setForeground(new Color(0, 0, 0));
		lblID.setBackground(new Color(0, 0, 0));
		lblID.setBounds(288, 181, 132, 31);
		contentPane.add(lblID);
		
		txtID = new JTextField();
		txtID.setBounds(456, 187, 280, 19);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Source Code Pro Semibold", Font.PLAIN, 15));
		lblPassword.setBounds(288, 242, 132, 13);
		contentPane.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(456, 240, 280, 19);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblWelcome = new JLabel("Welcome to our Group");
		lblWelcome.setForeground(new Color(0, 0, 0));
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblWelcome.setBounds(365, 68, 365, 48);
		contentPane.add(lblWelcome);
		
		JLabel btnNext = new JLabel("FunFair KaBooM");
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNext.setForeground(new Color(0, 0, 0));
		btnNext.setBounds(375, 112, 186, 31);
		contentPane.add(btnNext);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ticketing a = new Ticketing();
				
				String ID = txtID.getText();
				int password = Integer.parseInt(txtPassword.getText());
				
				if(ID.equalsIgnoreCase("ZIA") && password == 123) {
					a.show();
					dispose();
				}else if (ID.equalsIgnoreCase("Haiqhal") && password == 123) {
					a.show();
					dispose();
				}else if (ID.equalsIgnoreCase("Faris") && password == 123) {
					a.show();
					dispose();
				}else if (ID.equalsIgnoreCase("Insyirah") && password == 123) {
					a.show();
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null,"Check Your Detail");
				}
				
				
			}
		});
		btnNewButton.setBounds(589, 314, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtID.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnNewButton_1.setBounds(393, 314, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
