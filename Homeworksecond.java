import java.util.Scanner;
import java.lang.Math;

// 2 задание 3 номер 

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, x, y;

		System.out.print("a = ");
		a = scan.nextFloat();
		System.out.print("b = ");
		b = scan.nextFloat();
		System.out.print("x = ");
		x = scan.nextFloat();

		if (3 * Math.pow(b, 2) > a) {
			y = Math.pow(Math.E, Math.sin(x)) + b;
			System.out.println("y = " + y);
		} if (3 * Math.pow(b, 2) <= a) {
			y = Math.pow(Math.E, -x) + a * Math.log10(x);
			System.out.println("y = " + y);
		}
	}
}

// 2 задание switch

// public class Homework {
// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		int year, mouth;

// 		System.out.print("Введите год: ");
// 		year = scan.nextInt();
// 		mouth = year % 12;
// 		switch (mouth) {
// 			case 0: 
// 				System.out.print("Год обезьяны!"); // 1 месяц (например 1992 % 2 == 0)
// 				break;
// 			case 1: 
// 				System.out.print("Год петуха!"); // 2 
// 				break;
// 			case 2: 
// 				System.out.print("Год собаки!");
// 				break;
// 			case 3: 
// 				System.out.print("Год свиньи!");
// 				break;
// 			case 4: 
// 				System.out.print("Год крысы!");
// 				break;
// 			case 5:
// 				System.out.print("Год коровы!");
// 				break;
// 			case 6:
// 				System.out.print("Год тигра!");
// 				break;	
// 			case 7: 
// 				System.out.print("Год зайца!");
// 				break;
// 			case 8: 
// 				System.out.print("Год дракона!");
// 				break;
// 			case 9: 
// 				System.out.print("Год змеи!");
// 				break;
// 			case 10: 
// 				System.out.print("Год лошади!");
// 				break;
// 			case 11: 
// 				System.out.print("Год овцы!");
// 				break;
// 			default:
// 				System.out.println("Invalid mouth!");
// 		}
// 	}
// }
