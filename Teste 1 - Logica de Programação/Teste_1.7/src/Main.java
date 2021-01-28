
public class Main {

	public static void main(String[] args) {
		
		int vetor[] = new int[] {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
		obterElementosPares(vetor);
		
	}
	
	public static int[] obterElementosPares(int vet[]) {
		int tam = 0;
		for(int i = 0;i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				tam++;
			}
		}
		int[] novoVetor = new int[tam];
		for(int i = 0, j = 0;i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				novoVetor[j] = vet[i];
				j++;
			}
		}
		System.out.printf("{");
		for(int i = 0;i < novoVetor.length; i++) {
			
			System.out.printf(" %d ", novoVetor[i]);
		}
		System.out.printf("}");
			
		return novoVetor;
	}
}
