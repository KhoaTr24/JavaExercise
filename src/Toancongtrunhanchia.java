import java.util.Scanner;

public class Toancongtrunhanchia {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a= ");
		a = sc.nextInt();
		System.out.println("Nhap b");
		b = sc.nextInt();
		int tong = a+b;
		System.out.println(a +" + " +b +" = " +tong);
		int tru = a-b;
		System.out.println(a +" - " +b +" = " +tru);
		float chia = (float)a/b;
		System.out.println(a +" / " +b +" = " +chia);
		int chialaydu = a%b;
		System.out.println(a +" % " +b +" = " +chialaydu);
	}
}
