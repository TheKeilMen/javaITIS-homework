import java.util.Scanner;
import java.lang.Math;

// 1 задание 8 номер

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x, y, z2, z1;
		System.out.print("x = ");
		x = scan.nextFloat();
		System.out.print("y = ");
		y = scan.nextFloat();

		// первая функция
		z1 = Math.pow(Math.cos(x), 4) + Math.pow(Math.sin(x), 2) + 0.25 * Math.sin(2*x) - 1;
		System.out.println("z1 = " + String.format("%.2f", z1));
		// вторая функция
		z2 = Math.sin(y + x) * Math.sin(y - x);
		System.out.println("z2 = " + String.format("%.2f", z2));
	}
}