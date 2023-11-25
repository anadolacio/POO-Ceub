package aula01;

public class ExemploFuncao {
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
		int idade = 17;
		maiorDeIdade(idade);
		idade = 22;
		maiorDeIdade(idade);
			
	}
}
