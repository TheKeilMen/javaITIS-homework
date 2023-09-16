import java.util.Scanner;
import java.lang.Math;


public class Main {
	public static void main(String[] args) {

		double x, y;
		double a, b, c;
		int n;

		Scanner scan = new Scanner(System.in);

		System.out.print("x: ");
		x = scan.nextDouble();
		System.out.print("y: ");
		y = scan.nextDouble();
		System.out.print("n: ");
		n = scan.nextInt();

		a = Math.sqrt(((x + y) / Math.log(Math.pow(x, 2))) * n);
		System.out.println(a);
		b = Math.pow( Math.E, -Math.abs(y)) + 1 / (Math.pow(x, 2) * Math.sqrt(n));
		System.out.println(b);
		c = Math.atan(x / n) + Math.abs(Math.pow(x, 2) * Math.sqrt(n * y));
		System.out.println(c);
	}
}