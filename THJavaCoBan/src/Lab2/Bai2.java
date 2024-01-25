package Lab2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c nhập từ bàn phím
		 Scanner sc = new Scanner(System.in);
	        double a,b,c, delta;
	        System.out.print("Nhập hệ số a: ");
	        a = sc.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        b = sc.nextDouble();
	        System.out.print("Nhập hệ số c: ");
	        c = sc.nextDouble();
	        delta = Math.pow(b, 2) - 4 * a * c;
	        
	        if (a == 0) { // giải phương trình bậc nhất
	            if (b == 0) {
	                if (c == 0) {
	                    System.out.println("Phương trình có vô số nghiệm.");
	                } else {
	                    System.out.println("Phương trình vô nghiệm.");
	                }
	            } else {
	                double x = -c / b;
	                System.out.println("Nghiệm của phương trình là: x = " + x);
	            }
	        } else { // giải phương trình bậc hai
	            if (delta < 0) {
	                System.out.println("Phương trình vô nghiệm.");
	            } else if (delta == 0) {
	                double nghiemKep = -b / (2 * a);
	                System.out.println("Phương trình có nghiệm kép: x = " + nghiemKep);
	            } else {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.println("Phương trình có 2 nghiệm phân biệt:");
	                System.out.printf("x1 = %.2f\n" , x1);
	                System.out.printf("x2 = %.2f\n" , x2);
	            }
	        }
	    }
	}


