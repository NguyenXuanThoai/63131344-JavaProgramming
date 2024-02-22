/**
 * 
 */
package Lab3;
import java.util.Scanner;
/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Nhập vào số N : ");
		int n = sc.nextInt();
		boolean SNT = true;
		if ( n <= 1) {
			SNT = false;
		} else {
			for(int i=2; i <= Math.sqrt(n); i++){ 
				if(n % i == 0){
					SNT = false;
					break;
				}
			}
		}
		
		if (SNT) {
	            System.out.println(n + " là số nguyên tố.");
		} else {
	            System.out.println(n + " không phải là số nguyên tố.");
	      }	
		
	}

}
