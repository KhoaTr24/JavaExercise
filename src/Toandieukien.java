import java.util.Scanner;

public class Toandieukien {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a= ");
		a = sc.nextInt();
		System.out.println("Nhap b");
		b = sc.nextInt();
		
		System.out.println(a +" <= " + b +" : " +(a<=b));
	}
}
