import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase;
		System.out.println("Digite uma frase: ");
		frase = input.nextLine();
		System.out.println("Numero de vogais: " + calcularVogais(frase));
		input.close();
	}
		

	public static int calcularVogais(String frase) {
		int cont = 0;
		for(int i = 0;i < frase.length();i++) {
			char c = frase.charAt(i);
			if(c == 'a') {
				cont++;
			}
			if(c == 'e') {
				cont++;
			}
			if(c == 'i') {
				cont++;
			}
			if(c == 'o') {
				cont++;
			}
			if(c == 'u') {
				cont++;
			}
		}
		return cont;
		
	}
}