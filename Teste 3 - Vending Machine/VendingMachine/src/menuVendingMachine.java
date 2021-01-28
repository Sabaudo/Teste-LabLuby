
public class menuVendingMachine implements vendingMachineInterface{


	private int numSelecao;
	private double totalPagamento = 0;
	private double totalDinheiroMaquina = 0;

	@Override
	public void displayProdutos() {
		System.out.println("\n -------- MENU MAQUINA DE VENDAS -------- \n");
		System.out.println("Itens disponíveis: ");
		
		for(Produtos produto: Produtos.values()) {
			if(!Produtos.SAIR.equals(produto)) {
				if(Produtos.ESTOQUE.equals(produto))
					break;
				System.out.println(produto.getNumSelecao() + " - " + produto.name() + " - R$" + produto.getPreco());
			}
			
		}
		System.out.println("7 - VISUALIZAR ESTOQUE");
		System.out.println("0 - IR PARA O PAGAMENTO");
		System.out.println("Selecione sua opção: ");
	}

	@Override
	public void selecionarProduto(int numSelecao) {
		this.numSelecao = numSelecao;
		if(numSelecao == 7) {
			for(Produtos produto: Produtos.values()) {
				if(!Produtos.SAIR.equals(produto)) {
					if(Produtos.ESTOQUE.equals(produto))
						break;
					System.out.println("Item: " + produto.name() + " - estoque: " + produto.getEstoque());
				}
			}
		}else{
			for(Produtos produto: Produtos.values()) {
				if(!Produtos.SAIR.equals(produto)) {
					if(produto.getNumSelecao() == numSelecao) {
						totalPagamento = totalPagamento + produto.getPreco();
						if(produto.getEstoque() == 0) {
							System.out.println("Não há mais deste item em estoque.");
							break;
						}
						produto.setSubtrairEstoque(produto.getEstoque());
					}
				}	
			}
		}
		System.out.println("Total a pagar: R$" + totalPagamento);
	}

	@Override
	public void mensagemPagamento() {
		System.out.println("\nInsira a quantia necessaria para pagamento: ");
	}

	@Override
	public boolean pagar(double pagamento) {
		double troco;
		double restante;
		if(pagamento == totalPagamento) {
			totalDinheiroMaquina = pagamento;
			System.out.println("Pagamento realizado com sucesso.");
			return true;
		}
		if(pagamento > totalPagamento) {
			troco = pagamento - totalPagamento;
			totalDinheiroMaquina = pagamento - troco;
			System.out.println("Pagamento realizado com sucesso.");
			System.out.println("Foi lhe devolvido seu troco de R$" + troco);
			return true;
		}
		else {
			restante = totalPagamento - pagamento;
			System.out.println("Valor inserido ainda não é o suficiente. Por favor termine seu pagamento.");
			System.out.println("Valor restante de R$" + restante);
			totalPagamento = restante;
			return false;
		}
		
	}
}
