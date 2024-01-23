package nxt;

/**
 * 
 */
public class InTenTuoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoten = "Nguyễn Xuân Thoại";
		int namsinh = 2003;
		int tuoi = java.time.Year.now().getValue() - namsinh;
		System.out.print(hoten + " năm nay " + tuoi +  " tuổi ");
		System.out.println(hoten + " năm nay " + tuoi +  " tuổi ");
		System.out.printf(hoten + " năm nay " + tuoi +  " tuổi ");
	}

}
