import java.util.Scanner;

public class Kiemtrangaythang {
	public static void main(String[] args) {
		int t,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon thang: ");
		t = sc.nextInt();
		System.out.println("Chon nam: ");
		n = sc.nextInt();
		
		switch (t) {
		case 1:
			System.out.println("Thang 1 co 31 ngay");
			break;
		case 2:
			if((n%4==0 && n%100!=0)||(n%400==0)) {
				System.out.println("Thang 2 co 29 ngay");
			}
			else {
				System.out.println("Thang 2 co 28 ngay");
			}
			break;
		case 3:
			System.out.println("Thang 3 co 31 ngay");
			break;
		case 4:
			System.out.println("Thang 4 co 30 ngay");
			break;
		case 5:
			System.out.println("Thang 5 co 31 ngay");
			break;
		case 6:
			System.out.println("Thang 6 co 30 ngay");
			break;
		case 7:
			System.out.println("Thang 7 co 31 ngay");
			break;
		case 8:
			System.out.println("Thang 8 co 30 ngay");
			break;
		case 9:
			System.out.println("Thang 9 co 31 ngay");
			break;
		case 10:
			System.out.println("Thang 10 co 30 ngay");
			break;
		case 11:
			System.out.println("Thang 11 co 31 ngay");
			break;
		case 12:
			System.out.println("Thang 12 co 31 ngay");
			break;

		default:
			break;
		}
	}
}
