
public enum Produtos {
	AGUA(1,2,5), CAFE(2,3,5), DORITOS(3,5,5), ENERGETICO(4,6,5), 
	COCACOLA(5, 5, 5), TWIX(6,1,5), ESTOQUE(7,0,0), SAIR(0,0,0);
	
	
	private int numSelecao;
	private int estoque;
	private double preco;

	Produtos(int numSelecao, double preco, int estoque) {
		this.numSelecao = numSelecao;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public static Produtos valueOf(int numberSelection){
        for(Produtos produto: Produtos.values()){
            if(numberSelection == produto.getNumSelecao()){
                return produto;
            }
        }
        return SAIR;
    }

	public int getNumSelecao() {
		return numSelecao;
	}

	public void setNumSelecao(int numSelecao) {
		this.numSelecao = numSelecao;
	}

	public double getPreco() {
		return preco;
	}
	public int getEstoque() {
		return estoque;
	}
	
	public void setSubtrairEstoque(int estoque) {
		this.estoque = estoque-1;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
