import java.util.Scanner;

public class Toanhoc {
	public static void main(String[] args) {
		double r, dienTich, chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap R = ");
		r = sc.nextDouble();
		
		//Tinh chu vi
		chuVi = 2*Math.PI*r;
		System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0);
		//Tinh dien tich
		dienTich = Math.PI*Math.pow(r, 2);
		System.out.println("Dien tich = " + Math.round(dienTich));
		
		
		/*System.out.println("|a| =" + Math.abs(a));
		System.out.println("min(a,b)= " + (int)Math.min(a, b));
		*/
	}
}
