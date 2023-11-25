package aula01;
import java.util.Scanner;

public class ExemploWhile {
	public static boolean maiorDeIdade (int idade) {
		final int maioridade =18;
		if (idade >= maioridade) {
			System.out.print(idade + " é maior de idade \n");
			return true;
		} else {
			System.out.print(idade + " é menor de idade \n");
			return false;
		}
			
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 17;
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt()
;
		while (!maiorDeIdade(idade)) {
			System.out.print("Digite novamente sua idade!\n ");
			idade = scanner.nextInt();
		}
		System.out.print("Você é maior de idade. Pode prosseguir! \n ");
		scanner.close();
			
	}
}
