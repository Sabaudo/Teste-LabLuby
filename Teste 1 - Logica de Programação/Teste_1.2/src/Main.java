import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fator;
		int mult;
		System.out.println("Informe o fator do premio: ");
		fator = input.next(); 
		System.out.println("Informe o valor de multiplicação: ");
		mult = input.nextInt();
		System.out.println("Premio: " + calcularPremio(100, fator, mult));
		
		input.close();
		
	}
	
	public static double calcularPremio(double valorPremio, String fator, int mult) {
		if(fator.compareTo("basic") == 0) {
			valorPremio = valorPremio*1;
		}
		if(fator.compareTo("vip") == 0) {
			valorPremio = valorPremio*1.2;
		}
		if(fator.compareTo("premium") == 0) {
			valorPremio = valorPremio*1.5;
		}
		if(fator.compareTo("deluxe") == 0) {
			valorPremio = valorPremio*1.8;
		}
		if(fator.compareTo("special") == 0) {
			valorPremio = valorPremio*2;
		}
		if(valorPremio * mult > 0) {
			return valorPremio * mult;
		}else {
			System.out.println("Valor do prêmio inválido");
			return 1;
		}
		
	}

}
