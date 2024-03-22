package nxt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class TinhToanNN extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textSo1;
    private JTextField textSo2;
    private JTextField textKQ;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TinhToanNN frame = new TinhToanNN();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public TinhToanNN() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 430, 631);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Số thứ nhất:");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel.setBounds(28, 10, 90, 30);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Số thứ hai:");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_1.setBounds(28, 52, 90, 30);
        contentPane.add(lblNewLabel_1);
        
        textSo1 = new JTextField();
        textSo1.setBounds(126, 10, 261, 30);
        contentPane.add(textSo1);
        textSo1.setColumns(10);
        
        textSo2 = new JTextField();
        textSo2.setBounds(126, 52, 261, 30);
        contentPane.add(textSo2);
        textSo2.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Kết quả:");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_2.setBounds(28, 106, 70, 30);
        contentPane.add(lblNewLabel_2);
        
        textKQ = new JTextField();
        textKQ.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textKQ.setEnabled(false);
        textKQ.setBounds(126, 107, 261, 30);
        contentPane.add(textKQ);
        textKQ.setColumns(10);
        
        JButton btnSoNN = new JButton("Tạo số ngẫu nhiên");
        btnSoNN.setForeground(Color.BLACK);
        btnSoNN.setBackground(new Color(240, 230, 140));
        btnSoNN.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnSoNN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int SoNN1 = taoSoNN();
                int SoNN2 = taoSoNN();
                textSo1.setText(String.valueOf(SoNN1));
                textSo2.setText(String.valueOf(SoNN2));
            }
        });
        btnSoNN.setBounds(126, 162, 170, 40);
        contentPane.add(btnSoNN);
		btnSoNN.setBounds(126, 162, 170, 40);
		contentPane.add(btnSoNN);
		
		JButton btnCong = new JButton("");
		btnCong.setForeground(Color.WHITE);
		btnCong.setBackground(Color.WHITE);
		btnCong.setIcon(new ImageIcon("C:\\Users\\ADMINIS\\Downloads\\plus.png"));
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cong();
			}
		});
		btnCong.setBounds(28, 215, 154, 144);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("");
		btnTru.setBackground(Color.WHITE);
		btnTru.setForeground(Color.WHITE);
		btnTru.setIcon(new ImageIcon("C:\\Users\\ADMINIS\\Downloads\\minus-sign.png"));
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tru();
			}
		});
		btnTru.setBounds(233, 215, 154, 144);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("");
		btnNhan.setForeground(Color.WHITE);
		btnNhan.setBackground(Color.WHITE);
		btnNhan.setIcon(new ImageIcon("C:\\Users\\ADMINIS\\Downloads\\close.png"));
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nhan();
			}
		});
		btnNhan.setBounds(28, 395, 154, 154);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("");
		btnChia.setForeground(Color.WHITE);
		btnChia.setBackground(Color.WHITE);
		btnChia.setIcon(new ImageIcon("C:\\Users\\ADMINIS\\Downloads\\divide.png"));
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chia();
			}
		});
		btnChia.setBounds(233, 395, 154, 154);
		contentPane.add(btnChia);
	}
	 int taoSoNN(){
	        Random random = new Random();
	        return random.nextInt(10) + 1;
	    }
	 void Cong(){
	        String soThuNhat = textSo1.getText().toString();
	        String soThuHai = textSo2.getText().toString();
	        int so1 = Integer.parseInt(soThuNhat);
	        int so2 = Integer.parseInt(soThuHai);
	        int tong = so1 + so2;
	        String KQ = String.valueOf(tong);
	        textKQ.setText(KQ);
	    }

	    void Tru(){
	        String soThuNhat = textSo1.getText().toString();
	        String soThuHai = textSo2.getText().toString();
	        int so1 = Integer.parseInt(soThuNhat);
	        int so2 = Integer.parseInt(soThuHai);
	        int hieu = so1 - so2;
	        String KQ = String.valueOf(hieu);
	        textKQ.setText(KQ);
	    }

	    void Nhan(){
	        String soThuNhat = textSo1.getText().toString();
	        String soThuHai = textSo2.getText().toString();
	        int so1 = Integer.parseInt(soThuNhat);
	        int so2 = Integer.parseInt(soThuHai);
	        int tich = so1 * so2;
	        String KQ = String.valueOf(tich);
	        textKQ.setText(KQ);
	    }

	    void Chia() {
	        String soThuNhat = textSo1.getText();
	        String soThuHai = textSo2.getText();
	        int so1 = Integer.parseInt(soThuNhat);
	        int so2 = Integer.parseInt(soThuHai);
	        if (so2 == 0) {
	            textKQ.setText("Không thể chia cho 0");
	        } else {
	            int thuong = so1 / so2;
	            textKQ.setText(String.valueOf(thuong));
	        }
	    }
}
