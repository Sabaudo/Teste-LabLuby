import java.util.Scanner;

public class Main {
	
	public static int calcularFatorial(int num, int fat) {
		for(int i = 2; i <= num; i++){
			fat *= i;
		}
		return fat;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		int fat = 1;
		System.out.println("Insira um numero para calcular seu fatorial: ");
		num = input.nextInt();
		System.out.println("Fatorial do numero " + num + ": " + calcularFatorial(num, fat));
		input.close();
	}
	
	
}
