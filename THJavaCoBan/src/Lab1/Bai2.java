package Lab1;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tính và xuất chu vi,diện tích và cạnh nhỏ của hình chữ nhật.

		Scanner sc = new Scanner(System.in);
		double chieuDai, chieuRong;
		
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
	    	chieuDai = sc.nextDouble();
	    	do {
	    		System.out.print("Nhập chiều rộng của hình chữ nhật: ");
	    		chieuRong = sc.nextDouble();
	    		
	    		if (chieuDai <= chieuRong) {
	    			System.out.println("Chiều rộng không được lớn hơn hoặc bằng chiều dài.");
	    		}
	    	} while (chieuDai <= chieuRong);
         
        	double chuVi = 2 * (chieuDai + chieuRong);
        	double dienTich = chieuDai * chieuRong;
        	double canhNhoNhat = Math.min(chieuDai, chieuRong);
      
        	System.out.printf("Chu vi của hình chữ nhật là: %.2f mét\n", chuVi);
        	System.out.printf("Diện tích của hình chữ nhật là: %.2f mét vuông\n", dienTich);
        	System.out.printf("Cạnh nhỏ của hình chữ nhật là: %.2f mét\n", canhNhoNhat);
        
        }
    }
	    

