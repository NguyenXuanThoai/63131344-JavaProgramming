package Lab2;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b nhập từ bàn phím.
		
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.print("Nhập hệ số a: ");
        a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = sc.nextDouble();
        double x = (double) (-b / a);
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            System.out.printf("Nghiệm của phương trình là: %.2f ",x);
        }
    }
}
