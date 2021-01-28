import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String valor;
		String desconto;
	
		System.out.println("Informe o valor: ");
		valor = input.next();
		
		System.out.println("Informe o desconto: ");
		desconto = input.next();
		
		valor.replaceAll(",", ".");

		System.out.println("Preço depois do desconto de " + desconto + ": R$" + calcularValorComDesconto(valor, desconto));
		input.close();
	}

	public static String calcularValorComDesconto(String valor, String desconto) {
		double valorD, descontoD, descontoFinal;
		valor = valor.replaceAll("\\,", ".");
		desconto = desconto.replaceAll("\\%", "");
		valorD = Double.valueOf(valor).doubleValue();
		descontoD = Double.valueOf(desconto).doubleValue();
		descontoFinal = valorD - (valorD *(descontoD/100));
		return String.valueOf(descontoFinal);
	}
}
