package area;

import java.util.Scanner;

public class Area {

	public Area() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el radio del círculo: ");
		double radio = scanner.nextDouble();

		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El área del círculo es: " + area);

		scanner.close();
	}

}
