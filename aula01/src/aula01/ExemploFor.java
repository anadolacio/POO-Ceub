package aula01;
//import java.util.Scanner;

public class ExemploFor {
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
		for ( int idade = 0; !maiorDeIdade(idade); idade++) {
			
		}
   }
}
