/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_votantes;

/**
 *
 * @author Felipe
 */
public class Tarea_votantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int apruebah=0, apruebam=0, desapruebam=0;
		int N = (int) Math.floor(Math.random()*400+100);
		char [][] votantes = new char[2][N]; 
		//Lo de arriba crea las variables, el N al azar, y la matriz.
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				int rand = (int) Math.floor(Math.random()*3);
				char voto=' ';
				if (rand>=0 && rand<1 ){
					voto = '0';
					if (i==1) {
						desapruebam++;
					}
				}
				if (rand>=1 && rand<2 ){
					voto = '1';
					if (i==0) {
						apruebah++;
					}
					if (i==1) {
						apruebam++;
					}
				}
				if (rand>=2 && rand<=3 ){
					voto = 'n';
				}
				votantes[i][j] = voto;
			}
		
		}
		//Este "for" rellena la matriz y aumenta los respectivos contadores cuando sea necesario.
		
		System.out.print("Hombres: |");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(votantes[i][j]+"|");
				if (j==N-1 && i==0){
					System.out.println("");
					System.out.print("Mujeres: |");
				}
			}
		}
		//Este "for" muestra la matriz. Aunque no lo pide en la tarea, es para que compruebe que la matriz funciona correctamente.
		
		float porc = (float) (apruebam+apruebah)/(2*N);
		int purc = (int) (porc*100);
		//Cálculos necesarios para el porcentaje de los que aprueban el gobierno.
		
		System.out.println("");
		System.out.println("\nLa cantidad de hombres que aprueban el gobierno es " + apruebah);
		System.out.println("La cantidad de mujeres que desaprueban el gobierno es " + desapruebam);
		System.out.println("El porcentaje de personas que aprueban el gobierno es " + (purc) + "%");
		System.out.println("La cantidad total de votantes es " + 2*N);

    }
    
}
