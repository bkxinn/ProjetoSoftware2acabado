package mattbk;

import java.util.Scanner;

public class testando {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	String nome;
	
	System.out.println("Digite seu nome:  ");
	nome = sc.next();
	String sobrenome = sc.next();
	System.out.println("Você Digitou " +  nome  + " " +  sobrenome);
	System.out.println("Olá " + nome + "Quantos anos você tem?");
	int idade = sc.nextInt();
	System.out.println("Então você tem " + idade + "E qual seria sua altura? ");
	double altura = sc.nextDouble();
	System.out.println("Então seu nome é " + nome + "sua idade é " + idade + "e sua altura é de " + altura + "?");
	System.out.println("TU É GAY");
	
	sc.close();
	}
}