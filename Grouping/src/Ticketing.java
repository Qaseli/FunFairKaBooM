import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticketing extends JFrame {

	private JPanel contentPane;
	private int adult, children;
	private int adultc, childrenc;
	private int adultp, childrenp;;
	//private JSpinner spinner_1, spinner_2,  spinnerAdult, spinnerChildren;
	JSpinner spinner_1 = new JSpinner();
	JSpinner spinner_2 = new JSpinner();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketing frame = new Ticketing();
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
	public Ticketing() {
		setTitle("Ticketing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 563);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTicket = new JLabel("Ticket Here");
		lblTicket.setBounds(409, 12, 284, 88);
		lblTicket.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 40));
		lblTicket.setForeground(new Color(0, 0, 0));
		contentPane.add(lblTicket);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(26, 118, 237, 96);
		lblCategory.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 40));
		lblCategory.setForeground(new Color(0, 0, 0));
		contentPane.add(lblCategory);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setBounds(79, 222, 86, 47);
		lblAdult.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblAdult.setForeground(new Color(0, 0, 0));
		contentPane.add(lblAdult);
		
		JSpinner spinnerAdult = new JSpinner();
		spinnerAdult.setBounds(188, 235, 70, 20);
		spinnerAdult.setForeground(new Color(0, 0, 0));
		contentPane.add(spinnerAdult);
		
		JLabel lblChildren = new JLabel("Children");
		lblChildren.setBounds(79, 279, 105, 69);
		lblChildren.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblChildren.setForeground(new Color(0, 0, 0));
		contentPane.add(lblChildren);
		
		JSpinner spinnerChildren = new JSpinner();
		spinnerChildren.setBounds(188, 303, 70, 20);
		contentPane.add(spinnerChildren);
		
		JLabel lblMemberShip = new JLabel("Package");
		lblMemberShip.setBounds(800, 142, 210, 48);
		lblMemberShip.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 40));
		lblMemberShip.setForeground(new Color(0, 0, 0));
		contentPane.add(lblMemberShip);
		
		JLabel lblMember = new JLabel("Lanyard ");
		lblMember.setBounds(810, 197, 94, 58);
		lblMember.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblMember.setForeground(new Color(0, 0, 0));
		contentPane.add(lblMember);
		
		JLabel lblPic = new JLabel("");
		lblPic.setBounds(430, 106, 217, 307);
		lblPic.setIcon(new ImageIcon("C:\\Users\\60189\\Pictures\\Carnival Horse Poster.png"));
		contentPane.add(lblPic);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(603, 451, 134, 25);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adultc = (int) spinnerAdult.getValue();
				childrenc = (int) spinnerChildren.getValue();
				adultp =  (int) spinner_1.getValue();
				childrenp = (int) spinner_2.getValue();
				
				 adult = adultc*30;
				 children = childrenc*25;
				int totalc = (adultc*30 + childrenc*25);
				int totalp = (adultp*5) + (childrenp*5);
				int total = totalc + totalp;
				
				Receipt tt = new Receipt(adultc ,adult, childrenc ,children, adultp ,childrenp ,totalc ,totalp ,total);
				setVisible(false);
				
				tt.setVisible(true);
				
			}
		});
		contentPane.add(btnNext);
		
		JButton btnAboutUs = new JButton("Ticket Price");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Discout dc = new Discout();
				dc.show();
				dispose();
			}
		});
		btnAboutUs.setBounds(337, 453, 143, 25);
		contentPane.add(btnAboutUs);
		
		JLabel lblAddOn = new JLabel("( Add on RM5)");
		lblAddOn.setBounds(912, 196, 167, 58);
		lblAddOn.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblAddOn.setForeground(new Color(0, 0, 0));
		contentPane.add(lblAddOn);
		
		JLabel lblNewLabel = new JLabel("Adult");
		lblNewLabel.setBounds(806, 265, 60, 58);
		lblNewLabel.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Children");
		lblNewLabel_1.setBounds(800, 327, 94, 58);
		lblNewLabel_1.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		contentPane.add(lblNewLabel_1);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(958, 283, 70, 20);
		contentPane.add(spinner_1);
		
		spinner_2 = new JSpinner();
		spinner_2.setBounds(960, 344, 68, 20);
		contentPane.add(spinner_2);
	}
}
