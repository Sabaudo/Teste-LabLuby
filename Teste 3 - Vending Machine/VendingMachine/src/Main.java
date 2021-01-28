import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		double pagamento;

		vendingMachineInterface vendingMachine = new menuVendingMachine();
		do {
		vendingMachine.displayProdutos();
		op = input.nextInt();
		vendingMachine.selecionarProduto(op);
		
		}while(op != 0);
		vendingMachine.mensagemPagamento();
		do {
			pagamento = input.nextDouble();
		}while(!vendingMachine.pagar(pagamento));
		System.out.println("Saindo da maquina. . .");
		
		input.close();
	}

}
