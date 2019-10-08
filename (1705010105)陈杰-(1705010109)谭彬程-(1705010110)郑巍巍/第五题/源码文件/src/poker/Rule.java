package poker;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Rule() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAwdawdawdawdAdwadawdawDawdawd = new JTextPane();
		txtpnAwdawdawdawdAdwadawdawDawdawd.setEditable(false);
		txtpnAwdawdawdawdAdwadawdawDawdawd.setText("\u6BCF\u4EBA\u53D1\u4E09\u624B\u724C\uFF0C\u6BD4\u724C\u578B\u7684\u5927\u5C0F\u3002\r\n\u6700\u9AD8\u7B49\u7EA7\u7684\u724C\u578B\u662F\u540C\u82B1\uFF0C\u6700\u5927\u7684\u540C\u82B1\u724C\u662F\u540C\u4E00\u82B1\u8272\u7684Q,K,A\u3002\r\n\u7B2C\u4E8C\u7B49\u7EA7\u7684\u724C\u578B\u662F\u987A\u5B50\uFF0C\u6700\u5927\u7684\u987A\u5B50\u662F\u4E0D\u540C\u8272\u7684Q,K,A\u3002\r\n\u7B2C\u4E09\u7B49\u7EA7\u7684\u724C\u578B\u662F\u540C\u70B9\uFF0C\u70B9\u6570\u76F8\u540C\u7684\u4E09\u5F20\u724C\u3002\r\n\u7B2C\u56DB\u7B49\u7EA7\u7684\u724C\u578B\u662F\u5BF9\u5B50\uFF0C\u70B9\u6570\u76F8\u540C\u7684\u4E24\u5F20\u724C\u3002\r\n\u7B2C\u4E94\u7B49\u7EA7\u7684\u724C\u578B\u662F\u6742\u724C\uFF0C\u9664\u4E86\u4E0A\u9762\u56DB\u79CD\u724C\u578B\u7684\u724C\u5373\u662F\u6742\u724C\u3002\r\n\u4E24\u4EBA\u724C\u578B\u4E0D\u540C\uFF0C\u6BD4\u8F83\u724C\u578B\u7B49\u7EA7\uFF0C\u7B49\u7EA7\u5927\u8005\u8D62\uFF1B\u82E5\u7B49\u7EA7\u76F8\u540C\uFF0C\u5219\u6BD4\u8F83\u5927\u5C0F\uFF0C\u70B9\u6570\u5927\u8005\u80DC\u3002");
		txtpnAwdawdawdawdAdwadawdawDawdawd.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		txtpnAwdawdawdawdAdwadawdawDawdawd.setBounds(22, 55, 390, 145);
		contentPane.add(txtpnAwdawdawdawdAdwadawdawDawdawd);
		
		JLabel label = new JLabel("\u89C4\u5219");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		label.setBounds(188, 10, 54, 26);
		contentPane.add(label);
		
		JButton button = new JButton("\u8FD4\u56DE\u83DC\u5355");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(161, 210, 93, 23);
		contentPane.add(button);
	}
}
