import java.util.Scanner;

public class Toantudieukien {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		String ketQua = (a>5)?" lon hon 5":" nho hon 5";
		
		System.out.println(a + ketQua);
	}
}
