/**
 * 
 */
package Lab3;
import java.util.Scanner;
/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		for ( int i =1; i <=9; i++) {
			for ( int j = 1; j <=10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println(); 
		}
	}

}
