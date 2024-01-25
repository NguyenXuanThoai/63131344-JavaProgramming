package Lab1;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		// Tính và xuất thể tích của khối lập phương

	Scanner sc = new Scanner(System.in);
	double canh,theTich;
	System.out.print("Nhập vào cạnh của khối lập phương: ");
	canh = sc.nextDouble();
	theTich = Math.pow(canh, 3);
	System.out.printf("Thể tích của khối lập phương là: %.2f",theTich);
	}
}
