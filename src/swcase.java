import java.util.Scanner;

public class swcase {
	public static void main(String[] args) {
		int n;
		System.out.println("Nhap lua chon 0 - 2: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		switch (n) {
		case 0:
			System.out.println("Hello case 0");
			break;
		case 1:
			System.out.println("Hello case 1");
			break;
		case 2:
			System.out.println("Hello case 2");
			break;
		default:
			System.out.println("Nhap sai so roi");
		}
		
	}
}
