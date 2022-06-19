import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Discout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discout frame = new Discout();
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
	public Discout() {
		setTitle("Discount");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1066, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTicket = new JLabel("Ticket Price ");
		lblTicket.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblTicket.setForeground(new Color(0, 0, 0));
		lblTicket.setBounds(57, 43, 264, 60);
		contentPane.add(lblTicket);
		
		JLabel lblPic1 = new JLabel("");
		lblPic1.setBounds(44, 144, 333, 330);
		contentPane.add(lblPic1);
		lblPic1.setIcon(new ImageIcon("C:\\Users\\60189\\OneDrive\\Pictures\\UCS\\WhatsApp Image 2022-06-15 at 11.18.48 AM.jpeg"));
		
		JLabel lblPic2 = new JLabel("New label");
		lblPic2.setIcon(new ImageIcon("C:\\Users\\60189\\OneDrive\\Pictures\\UCS\\WhatsApp Image 2022-06-15 at 11.03.45 AM.jpeg"));
		lblPic2.setBounds(413, 68, 575, 170);
		contentPane.add(lblPic2);
		
		JLabel lblPic3 = new JLabel("New label");
		lblPic3.setIcon(new ImageIcon("C:\\Users\\60189\\OneDrive\\Pictures\\UCS\\WhatsApp Image 2022-06-15 at 11.03.58 AM.jpeg"));
		lblPic3.setBounds(413, 304, 575, 170);
		contentPane.add(lblPic3);
		
		JLabel lblSymbol = new JLabel("~~~~~~~~~~");
		lblSymbol.setFont(new Font("Rockwell Condensed", Font.PLAIN, 40));
		lblSymbol.setForeground(new Color(0, 0, 0));
		lblSymbol.setBounds(56, 102, 251, 13);
		contentPane.add(lblSymbol);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ticketing a = new Ticketing();
				setVisible(false);
				a.setVisible(true);
			}
		});
		btnBack.setBounds(76, 485, 102, 21);
		contentPane.add(btnBack);
	}

}
