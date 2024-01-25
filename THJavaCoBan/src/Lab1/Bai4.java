package Lab1;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c, delta;
		System.out.print("Nhập vào a:");
		a = sc.nextDouble();
		System.out.print("Nhập vào b:");
		b = sc.nextDouble();
		System.out.print("Nhập vào c:");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.printf("delta là: %.2f\n", delta);
		if (delta >= 0) {
            		double canDelta = Math.sqrt(delta);
            		System.out.printf("Căn delta là: %.2f\n " ,canDelta);
        	} else {
        		System.out.println("delta < 0 nên không thể tính căn.");
        	}
	}
}
