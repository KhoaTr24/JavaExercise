import java.util.Scanner;

public class Bangcuchuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap bang cuu chuong: ");
		int a;
		a = sc.nextInt();
		while (a<=1 || a<10) {
			switch (a) {
			case 1:
				for(int i =1; i<10; i++) {
					System.out.println("1" + "*" + i +"=" + i*1);
				}
				break;
			case 2:
				for(int i = 1; i<10; i++) {
					System.out.println("2" + "*" + i +"=" + i*2);
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
			default:
				break;
			}
			break;
		}
	}		
}

