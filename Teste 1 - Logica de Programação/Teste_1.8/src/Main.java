
public class Main {

	public static void main(String[] args) {
		String[] vetor = new String[] {
			    "John Doe",
			    "Jane Doe",
			    "Alice Jones",
			    "Bobby Louis",
			    "Lisa Romero"
			};
		buscarPessoa(vetor, "Doe");
		buscarPessoa(vetor, "Michael");
		buscarPessoa(vetor, "Bobby");
		buscarPessoa(vetor, "Alice");
	}
	
	public static String buscarPessoa(String vetor[], String busca) {
		System.out.printf("{");
		String nome;
		for(String n: vetor) {
			nome = n;
			if(nome.contains(busca)) {
				System.out.printf(" %s, ", nome);
			}
		}
		System.out.printf("}");
		System.out.println();
		return null;
		
	}
}
