import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Tarea de ayudantía: torneo de caridad (versión Java)
* Felipe Acuña
*/

public class tarea02 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int N = 0;
		int G = 0;
		int P = 0;
		int puntaje = 0;
		boolean try1 = true;
		
		do{
			try{
				System.out.println("Ingrese la cantidad de partidos jugados");
				N = leer.nextInt();
				try1 = false;
			}catch(InputMismatchException uh){
				System.out.println("Carácter erroneo");
				leer.nextLine();
			}
		}while(try1 == true);
		//Ingresa cantidad de partidos
		
		try1 = true;
		int marcadores[][] = new int[N][2];
		for (int filas = 0; filas < N; filas++) {
				System.out.println("Ingrese los goles a favor y en contra del partido n° " 
									+ (filas + 1));
			for (int columnas = 0; columnas < 2; columnas++) {
				do{
					try{
						marcadores[filas][columnas] = leer.nextInt();
						try1 = false;
					}catch(InputMismatchException uh){
						System.out.println("Carácter erroneo");
						leer.nextLine();
					}
				}while(try1 == true);
				try1 = true;
			}
		}
		//ingresa los resultados de los partidos en una matriz de N*2
		
		for (int filas = 0; filas < N; filas++) {
			for (int columnas = 0; columnas < 2; columnas++) {
				System.out.print(marcadores[filas][columnas] + " ");
			}
			System.out.println();
		}
		//muestra los resultados de forma ordenada
		
		
		G = N + 1;  /*La cantidad de goles se establece 
					* automáticamente como la cantidad de partidos + 1
					*/
		do{
			puntaje = 0;
			try1 = true;
			System.out.println("Tiene " + G + " goles para gastar\n"
					           + "¿A que partido desea agregarlo? (número)");
			do{
				try{
					P = leer.nextInt();
					try1 = false;
				}catch(InputMismatchException uh){
					System.out.println("Carácter erroneo");
					leer.nextLine();
				}
			}while(try1 == true);
			while (P > N || P <= 0){
				System.out.println("Número incorrecto, ingrese de nuevo");
				try1 = true;
				do{
					try{
						P = leer.nextInt();
						try1 = false;
					}catch(InputMismatchException uh){
						System.out.println("Carácter erroneo");
						leer.nextLine();
					}
				}while(try1 == true);
			}
			marcadores[P - 1][0]++;
			G--;
			System.out.println("Los nuevos resultados son:\n");
			for (int filas = 0; filas < N; filas++) {
				for (int columnas = 0; columnas < 2; columnas++) {
					System.out.print(marcadores[filas][columnas] + " ");
				}
				if (marcadores[filas][0] - marcadores[filas][1] > 0){
					puntaje = puntaje + 3;
				} else if (marcadores[filas][0] - marcadores[filas][1] == 0){
					puntaje++;
				}
				System.out.println();
			}
			System.out.println("\nEl nuevo puntaje es " + puntaje);
		}while (G > 0);
		//agrega goles
		
		System.out.println("El puntaje máximo es " + puntaje);
		
		leer.close();
	}

}
