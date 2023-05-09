import java.util.Scanner;

public class PTB2 {
	public static void main(String[] args) {
		//PTB2:ax^2+bx+c=0
		/*B1. Delta = b^2-4ac
		 * B2.Delta <0 =>PT vo nghiem
		 * 2.1 Delta ==0 => PT co nghiem kep x1=x2=-b/2a
		 * 2.2 Delta >0 => Pt co 2 nghiem
		 * x1 = (-b-sqrt(delta))/(2a)
		 * x2 = (-b+sqrt(delta))/(2a)
		 */
		double a,b,c,x,x2,delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a= ");
		a = sc.nextDouble();
		System.out.println("Nhap b= ");
		b = sc.nextDouble();
		System.out.println("Nhap c= ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2)-4*a*c;
		if (a==0) {
			System.out.println("a khong duoc bang 0");
		}else {
			if(delta < 0) {
				System.out.println("PT vo nghiem");
			}else if (delta ==0) {
				x = -b/(2*a);
				System.out.println("PT co nghiem kep x1=x2= "+x);
			}else {
				x=(-b-Math.sqrt(delta))/(2*a);
				x2=(-b+Math.sqrt(delta))/(2*a);
				System.out.println("PT co 2 nghiem:");
				System.out.println("x1= " +x);
				System.out.println("x2= " +x2);
			}
		}
		
	}
}
