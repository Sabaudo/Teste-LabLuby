import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		int cont = 0;
		System.out.println("Insira um valor: ");
		num = input.nextInt();
		for(int i = 2; i <= num;i++) {
			if(contarNumeroPrimos(i)) {
				cont++;
				System.out.println("Numero primo: " + i);
			}
		}
		System.out.println("Total de numeros primos: " + cont);
		input.close();
		
	}
	
	public static boolean contarNumeroPrimos(int n) {
		for(int i = 2; i < n;i++) {
			if(n % i == 0) {
				return false;
			}
		
		}
		return true;
	}
}
