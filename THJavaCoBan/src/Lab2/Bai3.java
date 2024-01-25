/**
 * 
 */
package Lab2;
import java.util.Scanner;
/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo phương pháp lũy tiến
		Scanner sc = new Scanner(System.in);
		double soDien, tien;
		System.out.print("Nhập vào số điện sủ dụng trong tháng: ");
		soDien = sc.nextDouble();
		
		if(soDien < 50){
			tien = soDien * 1000;
		} else {
			tien = 50 * 1000 + (soDien - 50) * 1200;
		}
		System.out.printf("Tiền điện trong tháng là: %.0f", tien);
	}

}
