import java.util.Scanner;

public class Chuyendoinhiphan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		System.out.println("Nhi phan cua " +n +" la");
		
		String nhiPhan = "";
		while(n>0) {
			nhiPhan = (n%2) + nhiPhan;
			n=n/2;
		}
		System.out.println(nhiPhan);
	}
}
