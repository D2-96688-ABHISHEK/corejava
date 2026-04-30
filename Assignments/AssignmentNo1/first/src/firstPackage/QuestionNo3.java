package firstPackage;
import java.util.Scanner;

public class QuestionNo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int quantity;
		double totalBill;
		System.out.println("Choose items and quantity : ");
		System.out.println("1.Dosa ");
		System.out.println("2.Samosa ");
		System.out.println("3.Idli ");
		
		choice = sc.nextInt();
		System.out.println("Enterd Quantity : ");
		quantity =sc.nextInt();
		
		switch (choice) {
		case 1: {
			System.out.println("Dosa Ordered");
			totalBill = quantity*20;
			System.out.println("TotalBill : "+ totalBill);
			break;
		}
		case 2: {
			System.out.println("Samosa Ordered");
			totalBill = quantity*25;
			System.out.println("TotalBill : "+ totalBill);
			break;
		}
		case 3: {
			System.out.println("Idli Ordered");
			totalBill = quantity*30;
			System.out.println("TotalBill : "+ totalBill);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}		
	}
}
