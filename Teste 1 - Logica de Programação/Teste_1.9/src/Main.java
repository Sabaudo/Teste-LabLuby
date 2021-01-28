
public class Main {

	public static void main(String[] args) {
		int mat[][] = new int[3][2];
		mat = transformarEmMatriz("10,5,4,2,1,-5");
		for(int i = 0;i < mat.length;i++) {
			for(int j = 0;j < 2;j++) {
				System.out.printf(" %d ", mat[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static int[][] transformarEmMatriz(String valores){
		int cont = 0;
		//valores.split(",");
		String[] val = new String[10];
		int[][] numeros = new int[3][2];
		val = valores.split(",");
		for(int i = 0;i < (val.length/2);i++) {
			for(int j = 0;j < 2;j++) {
				numeros[i][j] = Integer.parseInt(val[cont]);
				cont++;
			}
		}
		
		return numeros;
	}
}


