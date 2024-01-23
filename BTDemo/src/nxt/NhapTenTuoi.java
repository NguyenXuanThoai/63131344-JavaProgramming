/**
 * 
 */
package nxt;
import java.util.Scanner;
/**
 * 
 */
public class NhapTenTuoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			String hoTen;
			int tuoi;
			System.out.print("Nhập vào họ tên:");
			hoTen = sc.nextLine();
			System.out.print("Nhập tuổi:");
			tuoi = sc.nextInt();
			
			System.out.print(hoTen + " năm nay " + tuoi +  " tuổi ");
		}
	}

}
