package mattbk;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double cel = sc.nextDouble();
		
		double fah = (cel * 9/5) + 32;
		
		double kel = cel + 273.15;
		
		System.out.println("A conversão em Fahrenheit fica " + fah + " e a conversão em Kelvin fica " + kel);

	}

}
