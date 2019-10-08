package poker;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MenuJF extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					MenuJF frame = new MenuJF();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuJF() {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u6251\u514B\u6E38\u620F");
		label.setFont(new Font("����", Font.PLAIN, 20));
		label.setBounds(167, 39, 99, 50);
		contentPane.add(label);
		
		JButton button = new JButton("\u5F00\u59CB\u6E38\u620F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("55555555555555555555555555555");
				GameJF window = new GameJF();
				System.out.println("66666666666666666666666666666666");
				window.setVisible(true);
				window.setLocationRelativeTo(null);
			}
		});
		button.setBounds(59, 141, 113, 27);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u89C4\u5219");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rule rulejf = new Rule();
				rulejf.setVisible(true);
				rulejf.setLocationRelativeTo(null);
			}
		});
		btnNewButton.setBounds(245, 141, 113, 27);
		contentPane.add(btnNewButton);
	}
}
