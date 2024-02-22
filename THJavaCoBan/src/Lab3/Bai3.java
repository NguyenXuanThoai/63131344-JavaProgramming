/**
 * 
 */
package Lab3;
import java.util.Arrays;
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
		Scanner sc = new Scanner (System.in);
		System.out.printf("Nhap so luong phan tu cua mang:");
		int n = sc.nextInt();
		int A[] = new int[n];
		
		// Nhập mảng 
		for (int i = 0; i < n; i++) {
            		System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            			A[i] = sc.nextInt();
		}
		
		// Sắp xếp mảng
		 Arrays.sort(A);
		 
		// Xuất mảng
		System.out.println("Mảng sau khi sắp xếp:");
	        	for (int i = 0; i < n; i++) {
	        		System.out.print(A[i] + " ");
	        	}
	        	System.out.println();
		
	        // Xuất phần tử có giá trị nhỏ nhất
	        int Min = A[0];
	        for (int i = 1; i < n; i++) {
	            Min = Math.min(Min, A[i]);
	        }
	        System.out.println("Phần tử nhỏ nhất của mảng là: " + Min);
	        
	        // Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
	        int sum = 0;
	        int dem = 0;
	        for (int i = 0; i < n; i++) {
	            if (A[i] % 3 == 0) {
	                sum += A[i];
	                dem++;
	            }
	        }
	        if (dem != 0) {
	            double TBC = (double) sum / dem;
	            System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + TBC);
	        } else {
	            System.out.println("Không có phần tử nào chia hết cho 3 trong mảng.");
	        }
	}
}
