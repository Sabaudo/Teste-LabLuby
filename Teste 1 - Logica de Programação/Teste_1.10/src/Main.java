
public class Main {

	public static void main(String[] args) {

		int[] vetor1 = new int[] {1,2,3,4,5};
		int[] vetor2 = new int[] {1,2,5};
		int[] vetor3 = new int[20];
		
		vetor3 = obterElementosFaltantes(vetor1, vetor2);
		System.out.printf("Elementos faltantes: {");
		for(int i = 0; i < vetor3.length;i++) {
			System.out.printf(" %d ", vetor3[i]);
		}
		System.out.printf("}");

		
		
	}

	public static int[] obterElementosFaltantes(int vet1[], int vet2[]) {
		int tam = 0;
		int igual;
		if(vet1.length > vet2.length || vet1.length == vet2.length) {
			for(int i = 0, j = 0; i < vet1.length;i++) {
				if(j >= vet2.length)
					break;
				if(vet2[j] == vet1[i]) {
					j++;
				}else {
					tam++;
				}
			}
			int novoVet[] = new int[tam];			
			for(int i = 0, j = 0, k = 0; i < vet1.length;i++) {
				if(j >= vet2.length)
					break;
				if(vet2[j] == vet1[i]) {
					j++;
				}else {
					novoVet[k] = vet1[i];
					k++;
				}
			}
			
			return novoVet;

		}
		else{
			for(int j = 0, i = 0; j < vet2.length;j++) {
				if(i >= vet1.length)
					break;
				if(vet1[i] == vet2[j]) {
					i++;
				}else {
					tam++;
				}
			}
			int novoVet[] = new int[tam];
			
			for(int j = 0, i = 0, k = 0; j < vet2.length;j++) {
				if(i >= vet1.length)
					break;
				if(vet1[i] == vet2[j]) {
					i++;
				}else {
					novoVet[k] = vet2[j];
					k++;
				}
			}
			
			return novoVet;
			
		}
	}
}
