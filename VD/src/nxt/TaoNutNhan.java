package nxt;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;
public class TaoNutNhan {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Vi du frame");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200);
		f.show();
		
		// tao 1 nbut bam
		JButton btnok = new JButton("Nhan vao day:");
				// gan len forn 
				f.add(btnok);
		// hien from
		f.show();
	}
}
