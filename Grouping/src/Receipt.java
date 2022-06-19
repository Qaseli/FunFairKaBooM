import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Receipt extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotal;
	private JTextField txtPacAdult;
	private JTextField txtAdultQty;
	private JTextField txtAdultPrice;
	private JTextField txtChildQty;
	private JTextField txtChildPrice;
	private JTextField txtPacChild;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Receipt(int adultc ,int adult ,int childrenc ,int children ,int adultp ,int childrenp ,int totalc ,int totalp ,int total) {
		setTitle("Receipt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1074, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Receipt Here");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(389, 10, 290, 104);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setForeground(new Color(230, 230, 250));
		panel.setBounds(34, 119, 1003, 367);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Javanese Text", Font.PLAIN, 30));
		lblTotal.setBounds(32, 286, 94, 74);
		panel.add(lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setText(Integer.toString(total));
		txtTotal.setBounds(146, 309, 162, 30);
		panel.add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Category ");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Javanese Text", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(32, 27, 270, 79);
		panel.add(lblNewLabel_2);
		
		JLabel lblAdultQty = new JLabel("Adult Qty       :");
		lblAdultQty.setForeground(new Color(0, 0, 0));
		lblAdultQty.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblAdultQty.setBounds(56, 99, 171, 30);
		panel.add(lblAdultQty);
		
		JLabel lblAdultPrice = new JLabel("Price               :");
		lblAdultPrice.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblAdultPrice.setBounds(56, 139, 171, 30);
		panel.add(lblAdultPrice);
		
		JLabel lblChildQty = new JLabel("Children Qty :");
		lblChildQty.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblChildQty.setBounds(56, 192, 154, 49);
		panel.add(lblChildQty);
		
		JLabel lblChildPrice = new JLabel("Price               :");
		lblChildPrice.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblChildPrice.setBounds(56, 238, 171, 30);
		panel.add(lblChildPrice);
		
		JLabel lblPacAdult = new JLabel("Package Adult");
		lblPacAdult.setFont(new Font("Javanese Text", Font.PLAIN, 30));
		lblPacAdult.setBounds(588, 28, 289, 78);
		panel.add(lblPacAdult);
		
		txtPacAdult = new JTextField();
		txtPacAdult.setText(Integer.toString(adultp));
		txtPacAdult.setBounds(564, 89, 264, 49);
		panel.add(txtPacAdult);
		txtPacAdult.setColumns(10);
		
		txtAdultQty = new JTextField();
		txtAdultQty.setText(Integer.toString(adultc));
		txtAdultQty.setBounds(233, 104, 137, 19);
		panel.add(txtAdultQty);
		txtAdultQty.setColumns(10);
		
		txtAdultPrice = new JTextField();
		txtAdultPrice.setText(Integer.toString(adult));
		txtAdultPrice.setBounds(233, 139, 137, 19);
		panel.add(txtAdultPrice);
		txtAdultPrice.setColumns(10);
		
		txtChildQty = new JTextField();
		txtChildQty.setText(Integer.toString(childrenc));
		txtChildQty.setBounds(233, 206, 137, 19);
		panel.add(txtChildQty);
		txtChildQty.setColumns(10);
		
		txtChildPrice = new JTextField();
		txtChildPrice.setText(Integer.toString(children));
		txtChildPrice.setBounds(233, 243, 137, 19);
		panel.add(txtChildPrice);
		txtChildPrice.setColumns(10);
		
		JLabel lblPacChild = new JLabel("Package Children");
		lblPacChild.setFont(new Font("Javanese Text", Font.PLAIN, 25));
		lblPacChild.setBounds(588, 195, 240, 43);
		panel.add(lblPacChild);
		
		txtPacChild = new JTextField();
		txtPacChild.setText(Integer.toString(childrenp));
		txtPacChild.setBounds(564, 238, 264, 49);
		panel.add(txtPacChild);
		txtPacChild.setColumns(10);
	}

}
