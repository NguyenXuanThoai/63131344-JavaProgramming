package Lab1;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		double dtb;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào họ tên:");
		hoTen = sc.nextLine();
		System.out.print("Nhập vào DTB:");;
		dtb = sc.nextDouble();
		
		System.out.print(hoTen+ " Điểm trung bình: " + dtb +"\n");
		System.out.println(hoTen+ " Điểm trung bình: " + dtb );
		System.out.printf(hoTen+ " Điểm trung bình: " + dtb );
	}

}
