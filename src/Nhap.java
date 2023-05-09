import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Nhap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		String hoTen = sc.nextLine();
		System.out.println("hoten: " +hoTen);
	}
}
