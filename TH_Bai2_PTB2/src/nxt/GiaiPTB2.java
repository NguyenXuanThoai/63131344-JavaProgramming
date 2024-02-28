package nxt;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaiPTB2 {

    private JFrame frame;
    private JTextField txA;
    private JTextField txB;
    private JTextField txC;
    private JTextField txtKetQua;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GiaiPTB2 window = new GiaiPTB2();
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
    public GiaiPTB2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setForeground(new Color(255, 0, 0));
        frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
        frame.setBounds(100, 100, 790, 468);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(10, 61, 756, 304);
        frame.getContentPane().add(panel);
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(245, 0, 0), new Color(255, 0, 0)), "Nhập vào các số a, b, c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))); 
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("a:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(206, 28, 51, 25);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("b:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_1.setBounds(206, 75, 51, 25);
        panel.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("c:");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_2.setBounds(206, 122, 51, 25);
        panel.add(lblNewLabel_1_2);
        
        txA = new JTextField();
        txA.setBounds(351, 29, 337, 31);
        panel.add(txA);
        txA.setColumns(10);
        
        txB = new JTextField();
        txB.setColumns(10);
        txB.setBounds(351, 82, 337, 31);
        panel.add(txB);
        
        txC = new JTextField();
        txC.setColumns(10);
        txC.setBounds(351, 129, 337, 31);
        panel.add(txC);
        
        JLabel lblNewLabel_2 = new JLabel("Kết quả");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(189, 190, 99, 25);
        panel.add(lblNewLabel_2);
        
        txtKetQua = new JTextField();
        txtKetQua.setForeground(new Color(0, 0, 0));
        txtKetQua.setBounds(351, 191, 337, 30);
        txtKetQua.setBorder(new LineBorder(new Color(176, 224, 230)));
        panel.add(txtKetQua);
        txtKetQua.setColumns(10);
        
        JButton btnGii = new JButton("Giải");
        btnGii.setBounds(300, 243, 116, 37);
        panel.add(btnGii);
        btnGii.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                XuLyGiaiPTB2();
            }
        });
        btnGii.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(192, 192, 192));
        panel_1.setBounds(0, 0, 776, 40);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC HAI");
        lblNewLabel.setBounds(273, 10, 260, 22);
        panel_1.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }

    void XuLyGiaiPTB2() {
        double a = Double.parseDouble(txA.getText());
        double b = Double.parseDouble(txB.getText());
        double c = Double.parseDouble(txC.getText());
        double del = b * b - 4 * a * c;
        if (del > 0) {
            double x1 = (-b + Math.sqrt(del)) / (2 * a);
            double x2 = (-b - Math.sqrt(del)) / (2 * a);
            txtKetQua.setText("x1 = " + x1 + " và x2 = " + x2);
        } else if (del == 0) {
            double x = -b / (2 * a);
            txtKetQua.setText("x = " + x);
        } else {
            txtKetQua.setText("Phương trình không có nghiệm");
        }
    }
}
