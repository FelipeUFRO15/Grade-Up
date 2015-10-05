import java.util.InputMismatchException;
import java.util.Scanner;

public class Taller01 {

	public static void main(String[] args) {
		int n = 0;
		int ceros = 0;
		int azar = 0;
		int diag1 = 1;
		int diag2 = 1;
		int aux;
		boolean leer_n = true;
		Scanner scn = new Scanner(System.in);
		int nums[] = new int[10];
		
		System.out.println("Ingrese un n para la matriz");
		do{
			try{
				n = scn.nextInt();
				leer_n = false;
			}catch(InputMismatchException error){
				System.out.println("Caracter inválido, solo se aceptan números");
				scn.nextLine();
			}
		}while(leer_n);
		System.out.println();
		
		int matriz[][] = new int [n][n];
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				azar = (int) Math.floor(Math.random()*10);
				if (azar == 0){
					ceros++;
				}
				matriz[i][j] = azar;
				System.out.print(matriz[i][j] + "    ");
				nums[azar]++;
			}
			System.out.println("\n");
		}
		
		for (int i = 0; i < n; i++){
			for ( int j = 0; j < n; j++){
				if (i == j){
					diag1 = diag1 * matriz [i][j];
				}
				if (i + j == (n - 1)){
					diag2 = diag2 * matriz[i][j];
				}
			}
		}
		System.out.println("La suma de el producto de la diagonal 1 (" + diag1 + ") más el de la diagonal 2 (" + diag2 + ") es " + (diag1 + diag2));
		
		System.out.println("\nLa cantidad de ceros es " + ceros);
		if (ceros > (Math.pow(n, 2))/2){
			System.err.println("ES una matriz CERO");
		}else{
			System.err.println("----NO ES una matriz CERO");	
		}
		
		
		
	}

}
