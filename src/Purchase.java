import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Purchase {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Pur() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Purchase window = new Purchase();
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
	public Purchase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 00, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(10, 69, 1416, 684);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register rg = new Register();
				rg.Reg();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 24, 180, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Purchase Management");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Purchase purch = new Purchase();
				purch.Pur();
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(200, 24, 234, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Sales and Billing");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalesAndBilling Sal = new SalesAndBilling();
				Sal.Sales();
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(643, 24, 171, 35);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Close");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_3.setBounds(824, 24, 156, 35);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1 = new JButton("Distributer List");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Distributer Dist=new Distributer();
				Dist.Distr();
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(444, 24, 188, 35);
		frame.getContentPane().add(btnNewButton_1_1);
	}
}


