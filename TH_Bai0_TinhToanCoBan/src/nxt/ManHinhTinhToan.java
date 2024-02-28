package nxt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txA;
	private JTextField txB;
	private JTextField txtKetQua;

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("CHƯƠNG TRÌNH THỰC HIỆN TÍNH TOÁN CƠ BẢN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(58, 70, 126, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai:");
		lblNhpSTh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSTh.setBounds(58, 117, 126, 26);
		contentPane.add(lblNhpSTh);
		
		txA = new JTextField();
		txA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txA.setBounds(182, 75, 222, 19);
		contentPane.add(txA);
		txA.setColumns(10);
		
		txB = new JTextField();
		txB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txB.setColumns(10);
		txB.setBounds(182, 119, 222, 19);
		contentPane.add(txB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(58, 196, 85, 21);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(182, 196, 85, 21);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(307, 196, 85, 21);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(429, 196, 85, 21);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán");
		lblKtQuTnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(58, 266, 126, 26);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setEnabled(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(182, 273, 222, 19);
		contentPane.add(txtKetQua);
	}
	
	void XuLyCong(){
		String str_soA = txA.getText();
		String str_soB = txB.getText();
		// chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		// tinh
		double tong = soA+soB;
		
		txtKetQua.setText(String.valueOf(tong));
	}
	void XuLyTru() {
		String str_soA = txA.getText();
		String str_soB = txB.getText();
		// chuyen kieu
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		// tinh
		double hieu = soA-soB;
		
		txtKetQua.setText(String.valueOf(hieu));
	}
	void XuLyNhan() {
	    String str_soA = txA.getText();
	    String str_soB = txB.getText();
	    // Chuyển kiểu
	    double soA = Double.parseDouble(str_soA);
	    double soB = Double.parseDouble(str_soB);
	    // Tính
	    double tich = soA * soB;
	    txtKetQua.setText(String.valueOf(tich));
	}

	void XuLyChia() {
	    String str_soA = txA.getText();
	    String str_soB = txB.getText();
	    // Chuyển kiểu
	    double soA = Double.parseDouble(str_soA);
	    double soB = Double.parseDouble(str_soB);
	    // Kiểm tra nếu số chia bằng 0
	    if (soB == 0) {
	        // Hiển thị thông báo lỗi
	        JOptionPane.showMessageDialog(this, "Không thể chia cho 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	    } else {
	        // Tính
	        double thuong = soA / soB;
	        txtKetQua.setText(String.valueOf(thuong));
	    }
	}
}
