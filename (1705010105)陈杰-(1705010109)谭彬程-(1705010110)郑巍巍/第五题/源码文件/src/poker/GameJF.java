package poker;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameJF extends JFrame {
	public static int Round;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public GameJF() {
		//界面
		Round = 1;
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 870, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u73A9\u5BB61");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 19));
		lblNewLabel.setBounds(197, 25, 72, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u73A9\u5BB62");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(604, 25, 72, 18);
		
        JLabel label_1 = new JLabel("");
        label_1.setFont(new Font("宋体", Font.PLAIN, 20));
        label_1.setBounds(401, 18, 84, 33);
        contentPane.add(label_1);
		contentPane.add(lblNewLabel_1);
		//发牌并开牌
		DealCard dealCard = new DealCard();
		List<Card> list=new ArrayList<>();
        Player player1=new Player();
        Player player2=new Player();
        String str1="";
        String str2="";
        String str3="";
        String str4="";
        String str5="";
        String str6="";
        int l1 = 0;
        int l2 = 0;
        list = dealCard.getCard();
        dealCard.Deal(list,player1);
        dealCard.Deal(list,player2);
        dealCard.CountCard(player1);
        dealCard.getlevel(player1);
        dealCard.CountCard(player2);
        dealCard.getlevel(player2);
        str3 = dealCard.winner(player1,player2);
        str1 = dealCard.ShowCard(player1);
        str2 = dealCard.ShowCard(player2);
        str4 = ("第"+Round+"回合");
        l1 = player1.getLevels();
        l2 = player2.getLevels();
        switch (l1) {
        case 1: str5 = "同花";break;
        case 2: str5 = "顺子";break;
        case 3: str5 = "同点";break;
        case 4: str5 = "对子";break;
        case 5: str5 = "杂牌";break;
        }
        switch (l2) {
        case 1: str6 = "同花";break;
        case 2: str6 = "顺子";break;
        case 3: str6 = "同点";break;
        case 4: str6 = "对子";break;
        case 5: str6 = "杂牌";break;
        }
        
        JLabel lblNewLabel_2 = new JLabel();
        lblNewLabel_2.setBounds(44, 111, 105, 150);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel();
        lblNewLabel_3.setBounds(164, 111, 105, 150);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel();
        lblNewLabel_4.setBounds(284, 111, 105, 150);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel();
        lblNewLabel_5.setBounds(464, 111, 105, 150);
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel();
        lblNewLabel_6.setBounds(584, 111, 105, 150);
        contentPane.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel();
        lblNewLabel_7.setBounds(704, 111, 105, 150);
        contentPane.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 14));
        lblNewLabel_8.setBounds(204, 292, 54, 15);
        contentPane.add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("");
        lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 14));
        lblNewLabel_9.setBounds(622, 292, 54, 15);
        contentPane.add(lblNewLabel_9);
        
        String [] arr = str1.split("\\s+");
        ImageIcon img[] = new ImageIcon[6];
    	int X=0;
        for(String ss : arr) {
        	img[X] = new ImageIcon(getClass().getResource("/images/"+ss+".jpg"));
        	X++;
        }
        String [] Brr = str2.split("\\s+");
        int y=3;
        for(String ss : Brr) {
        	img[y] = new ImageIcon(getClass().getResource("/images/"+ss+".jpg"));
        	y++;
        }
        lblNewLabel_2.setIcon(img[0]);
        lblNewLabel_3.setIcon(img[1]);
        lblNewLabel_4.setIcon(img[2]);
        lblNewLabel_5.setIcon(img[3]);
        lblNewLabel_6.setIcon(img[4]);
        lblNewLabel_7.setIcon(img[5]);
        
        JLabel label = new JLabel();
        label.setFont(new Font("宋体", Font.PLAIN, 20));
        label.setBounds(401, 322, 98, 33);
        contentPane.add(label);
        label.setText(str3);
        label_1.setText(str4);
        lblNewLabel_8.setText(str5);
        lblNewLabel_9.setText(str6);
        
        JButton button = new JButton("\u518D\u73A9\u4E00\u6B21");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//重新开始
        		Round++;
        		DealCard dealCard = new DealCard();
        		List<Card> list=new ArrayList<>();
                Player player1=new Player();
                Player player2=new Player();
                String str1="";
                String str2="";
                String str3="";
                String str4="";
                String str5="";
                String str6="";
                int l1 = 0;
                int l2 = 0;
                list = dealCard.getCard();
                dealCard.Deal(list,player1);
                dealCard.Deal(list,player2);
                dealCard.CountCard(player1);
                dealCard.getlevel(player1);
                dealCard.CountCard(player2);
                dealCard.getlevel(player2);
                str3 = dealCard.winner(player1,player2);
                str1 = dealCard.ShowCard(player1);
                str2 = dealCard.ShowCard(player2);
                str4=("第"+Round+"回合");
                l1 = player1.getLevels();
                l2 = player2.getLevels();
                switch (l1) {
                case 1: str5 = "同花";break;
                case 2: str5 = "顺子";break;
                case 3: str5 = "同点";break;
                case 4: str5 = "对子";break;
                case 5: str5 = "杂牌";break;
                }
                switch (l2) {
                case 1: str6 = "同花";break;
                case 2: str6 = "顺子";break;
                case 3: str6 = "同点";break;
                case 4: str6 = "对子";break;
                case 5: str6 = "杂牌";break;
                }
                String [] arr = str1.split("\\s+");
                ImageIcon img[] = new ImageIcon[6];
            	int X=0;
                for(String ss : arr) {
                	img[X] = new ImageIcon(getClass().getResource("/images/"+ss+".jpg"));
                	X++;
                }
                String [] Brr = str2.split("\\s+");
                int y=3;
                for(String ss : Brr) {
                	img[y] = new ImageIcon(getClass().getResource("/images/"+ss+".jpg"));
                	y++;
                }
                lblNewLabel_2.setIcon(img[0]);
                lblNewLabel_3.setIcon(img[1]);
                lblNewLabel_4.setIcon(img[2]);
                lblNewLabel_5.setIcon(img[3]);
                lblNewLabel_6.setIcon(img[4]);
                lblNewLabel_7.setIcon(img[5]);
                System.out.println(str1);
                System.out.println(l1);
                System.out.println(str2);
                System.out.println(l2);
                System.out.println(str3);
                label.setText(str3);
                label_1.setText(str4);
                lblNewLabel_8.setText(str5);
                lblNewLabel_9.setText(str6);
                
        	}
        });
        button.setBounds(284, 365, 119, 33);
        contentPane.add(button);
        
        JButton btnNewButton = new JButton("\u8FD4\u56DE\u83DC\u5355");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnNewButton.setBounds(460, 365, 119, 33);
        contentPane.add(btnNewButton);
        
        
        //检测数据是否正确
        System.out.println(str1);
        System.out.println(l1);
        System.out.println(str2);
        System.out.println(l2);
        System.out.println(str3);
	}
}
