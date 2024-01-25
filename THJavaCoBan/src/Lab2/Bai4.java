package Lab2;
import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức năng để thoát khỏi ứng dụng.
		Scanner sc = new Scanner(System.in);
		int luaChon;
		do {
			menu();
			System.out.print("Nhập vào lựa chọn:");
			luaChon = sc.nextInt();
			switch(luaChon) {
			case 1:
				Bai1(sc);
				break;			
			case 2:
				Bai2(sc);
				break;
			case 3:
				Bai3(sc);
				break;
			case 4:
				System.out.print("Kết thúc chương trình!!");
				break;
			default:
				System.out.print("Lựa chọn không phù hợp. Vui lòng chọn lại.\n");
				break;
			
			}
		}while(luaChon != 4);
	}
	public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }
	
	public static void Bai1(Scanner sc) {
		 double a,b;
	        System.out.print("Nhập hệ số a: ");
	        a = sc.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        b = sc.nextDouble();
	        double x = (double) (-b / a);
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm.\n");
	            } else {
	                System.out.println("Phương trình vô nghiệm.\n");
	            }
	        } else {
	            System.out.printf("Nghiệm của phương trình là: %.2f\n ",x);
	        }
	}
	
	public static void Bai2(Scanner sc) {
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
	public static void Bai3(Scanner sc) {
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
