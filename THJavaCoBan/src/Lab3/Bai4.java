/**
 * 
 */
package Lab3;
import java.util.Scanner;
/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhập số lượng sinh viên: ");
		int n = sc.nextInt();
		String[] ten = new String[n];
		double[] diem = new double[n];
		for (int i = 0; i < n; i++) {
	            System.out.print("Nhập họ tên của sinh viên thứ " + (i + 1) + ": ");
	            sc.nextLine(); 
	            ten[i] = sc.nextLine();
	            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
	            diem[i] = sc.nextDouble();
	    	}
		System.out.println("\nDanh sách sinh viên:");
	    	System.out.println("-----------------------------------------");
	    	System.out.println("Họ tên\t\tĐiểm\t\tHọc lực");
	        for (int i = 0; i < n; i++) {
	            String hocLuc;
	            if (diem[i] < 5) {
	            	hocLuc = "Yếu";
	            } else if (diem[i] < 6.5) {
	            	hocLuc = "Trung bình";
	            } else if (diem[i] < 7.5) {
	            	hocLuc = "Khá";
	            } else if (diem[i] < 9) {
	            	hocLuc = "Giỏi";
	            } else {
	            	hocLuc = "Xuất sắc";
	            }
	            System.out.println(ten[i] + "\t\t" + diem[i] + "\t\t" + hocLuc);
	        }
	        
	        // Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (diem[i] > diem[j]) {
	                    // Swap tên
	                    String t = ten[i];
	                    ten[i] = ten[j];
	                    ten[j] = t;
	                    // Swap điểm
	                    double d = diem[i];
	                    diem[i] = diem[j];
	                    diem[j] = d;
	                }
	            }
	        }
	        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
	        System.out.println("-----------------------------------------");
	        System.out.println("Họ tên\t\tĐiểm\t\tHọc lực");
	        for (int i = 0; i < n; i++) {
	            String hocLuc;
	            if (diem[i] < 5) {
	            	hocLuc = "Yếu";
	            } else if (diem[i] < 6.5) {
	            	hocLuc = "Trung bình";
	            } else if (diem[i] < 7.5) {
	            	hocLuc = "Khá";
	            } else if (diem[i] < 9) {
	            	hocLuc = "Giỏi";
	            } else {
	            	hocLuc = "Xuất sắc";
	            }
	            System.out.println(ten[i] + "\t\t" + diem[i] + "\t\t" + hocLuc);
	        }
	}
}
