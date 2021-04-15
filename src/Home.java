import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 159, 362, 594);
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Register rg = new Register();
				rg.Reg();
				
			}
		});
		btnNewButton.setBounds(10, 20, 342, 66);
		panel.add(btnNewButton);
		
		JButton btnPurchaseManagement = new JButton("Purchase Management");
		btnPurchaseManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Purchase purch = new Purchase();
				purch.Pur();
				
			}
		});
		btnPurchaseManagement.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPurchaseManagement.setBounds(10, 117, 342, 73);
		panel.add(btnPurchaseManagement);
		
		JButton btnDistributerList = new JButton("Distributer List");
		btnDistributerList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Distributer Dist=new Distributer();
				Dist.Distr();
			}
		});
		btnDistributerList.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDistributerList.setBounds(10, 222, 342, 73);
		panel.add(btnDistributerList);
		
		JButton btnSalesAndBilling = new JButton("Sales and Billing");
		btnSalesAndBilling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalesAndBilling Sal = new SalesAndBilling();
				Sal.Sales();
			}
		});
		btnSalesAndBilling.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSalesAndBilling.setBounds(10, 327, 342, 73);
		panel.add(btnSalesAndBilling);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnClose.setBounds(10, 436, 342, 66);
		panel.add(btnClose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(382, 159, 1144, 594);
		panel_1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 1516, 139);
		panel_2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Purchase Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(10, 10, 1478, 119);
		panel_2.add(lblNewLabel);
	}
}
