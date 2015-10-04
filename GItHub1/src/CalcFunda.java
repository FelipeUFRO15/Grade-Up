import java.util.Scanner;
import java.util.InputMismatchException;
public class CalcFunda {

	public static void menu(Scanner scn) {
		int menu1 = 0;
		int num1=0, num2=0;
		boolean menu=true;
		do{
			do{
				System.out.println("\n//////MENÚ//////");
				System.out.println("1.- Sumar dos números");
				System.out.println("2.- Restar dos números");
				System.out.println("3.- Multiplicar dos números");
				System.out.println("4.- Dividir dos números");
				System.out.println("5.- Encontrar el mayor de dos números");
				System.out.println("6.- Calcular un porcentaje de un número");
				System.out.println("7.- Salir del programa");
				try{
		            menu1= scn.nextInt();
		            menu = false;
		        }catch(InputMismatchException x){
		            System.out.println("Carácter inválido, solo números");
		            scn.nextLine();
		            menu=true;
		        }
			}while(menu);
			switch (menu1) {
			case 1:
				suma(scn, num1, num2);
				break;
				
			case 2:
				resta(scn, num1, num2);
				break;
				
			case 3:
				mult(scn, num1, num2);
				break;
				
			case 4:
				div(scn, num1, num2);
				break;
			
			case 5:
				mayor(scn, num1, num2);
				break;
				
			case 6:
				porc(scn, num1, num2);
				break;	
				
			case 7:
				salir(scn, num1);
				break;

			default:
				System.out.println("Opción inválida; ingrese de nuevo");
				break;
			}
		}while (menu1 != 7);
	};
	
	public static void suma(Scanner scn, int num1, int num2) {
		System.out.println("\n//////SUMA//////");
		boolean método = true;
		do {
			try {
				System.out.println("Ingrese el primer número");
				num1 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números\n");
                scn.nextLine();
			}
		}while (método);
		método=true;
		do {
			try {
				System.out.println("Ingrese el segundo número");
				num2 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números");
                scn.nextLine();
			}
		}while (método);
		int suma = num1+num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
	};
	
	public static void resta(Scanner scn, int num1, int num2) {
		System.out.println("\n//////RESTA//////");
		boolean método = true;
		do {
			try {
				System.out.println("Ingrese el primer número");
				num1 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números\n");
                scn.nextLine();
			}
		}while (método);
		método=true;
		do {
			try {
				System.out.println("Ingrese el segundo número");
				num2 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números");
                scn.nextLine();
			}
		}while (método);
		int resta = num1-num2;
		System.out.println("La resta de " + num1 + " y " + num2 + " es " + resta);
	};
	
	public static void mult(Scanner scn, int num1, int num2) {
		System.out.println("\n//////MULTIPLICACIÓN//////");
		boolean método = true;
		do {
			try {
				System.out.println("Ingrese el primer número");
				num1 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números\n");
                scn.nextLine();
			}
		}while (método);
		método=true;
		do {
			try {
				System.out.println("Ingrese el segundo número");
				num2 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números");
                scn.nextLine();
			}
		}while (método);
		int producto = num1*num2;
		System.out.println("El producto de " + num1 + " y " + num2 + " es " + producto);
	};
	
	public static void div(Scanner scn, int num1, int num2) {
		System.out.println("\n//////DIVISIÓN//////");
		boolean método = true;
		do {
			try {
				System.out.println("Ingrese el primer número");
				num1 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números\n");
                scn.nextLine();
			}
		}while (método);
		método=true;
		do {
			try {
				System.out.println("Ingrese el segundo número");
				num2 = scn.nextInt();
				while (num2==0){
					System.out.println("Resultado indeterminado, ingrese otro número");
					num2 = scn.nextInt();
				}
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números");
                scn.nextLine();
			}
		}while (método);
		double cociente = (double) num1/num2;
		System.out.println("El cociente de " + num1 + " y " + num2 + " es " + cociente);
	};
	
	public static void mayor(Scanner scn, int num1, int num2) {
		System.out.println("\n//////COMPARACIÓN//////");
		boolean método = true;
		do {
			try {
				System.out.println("Ingrese el primer número");
				num1 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números\n");
                scn.nextLine();
			}
		}while (método);
		método=true;
		do {
			try {
				System.out.println("Ingrese el segundo número");
				num2 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números");
                scn.nextLine();
			}
		}while (método);
		if (num1>num2){
			System.out.println("El número mayor es " + num1);
		}
		if (num2>num1){
			System.out.println("El número mayor es " + num2);
		}
		if (num1==num2){
			System.out.println("Ambos números son iguales");
		}
	};
	
	public static void porc(Scanner scn, int num1, int num2) {
		System.out.println("\n//////PORCENTAJE//////");
		boolean método = true;
		do {
			try {
				System.out.println("Ingrese un número");
				num1 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números\n");
                scn.nextLine();
			}
		}while (método);
		método=true;
		do {
			try {
				System.out.println("Ingrese el porcentaje de " + num1  + " que desea calcular");
				num2 = scn.nextInt();
				método=false;
			}
			catch (InputMismatchException x){
				System.out.println("Carácter inválido, solo números");
                scn.nextLine();
			}
		}while (método);
		double porc = (double) (num1*num2)/100;
		System.out.println("El " + num2 + "% de " + num1 + " es "+ porc);
	};
	
	public static void salir(Scanner scn, int num1) {
		System.out.println("\n//////SALIR//////");
		System.out.println("¿De verdad quiere dejar de utilizar este software?\nIngrese 1 (Si) o 2 (No)");
		boolean método=true;
		do{
			try{
				num1 = scn.nextInt();
				while (num1>2 || num1<1){
					System.out.println("Opción inválida, ingrese de nuevo");
					num1 = scn.nextInt();
				}
				if (num1 == 1){
					System.out.println("\n//////Gracias por usar este programa//////");
					break;
				}
				if (num1 == 2){
					menu(scn);
				}
				método=false;
			}
			catch(InputMismatchException x){
				System.out.println("Carácter inválido, solo números");
                scn.nextLine();
			}
		}while(método);
		
	};
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		menu(scn);
	}
}
