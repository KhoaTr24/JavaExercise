import java.util.Scanner;

public class Trycatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			System.out.println("Nhap vao n: ");
			n=sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap sai du lieu");
		}
	}
}
