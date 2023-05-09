import java.util.Iterator;
import java.util.Scanner;

public class lenhif_else {
	public static void main(String[] args) {
		
		/*PTB1: ax+b=0
		 * 
		 * Neu a =0
		 * 		=> Neu b =0 => PT vo so nghiem
		 * 		=> Neu b !=0 => PT vo nghiem
		 * Neu a !=0
		 * 		=> Co nghiem x = -b/a
		*/
		double a,b,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a= ");
		a = sc.nextDouble();
		System.out.println("Nhap b= ");
		b=sc.nextDouble();
		
		if(a == 0) {
			if (b == 0) {
				System.out.println("PT vo so nghiem");
			}
			else {
				System.out.println("PT vo nghiem");
			}
		}
		else {
			System.out.println("PT co nghiem x= " + -b/a);
		}
	}
}
