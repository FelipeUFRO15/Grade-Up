import java.util.Scanner;
public class CalcFunda {

	public static void menu(Scanner scn) {
		int menu1 = 0;
		int num1=0, num2=0;
		do{
			System.out.println("\n1.- Sumar dos números");
			System.out.println("2.- Restar dos números");
			System.out.println("3.- Multiplicar dos números");
			System.out.println("4.- Dividir dos números");
			System.out.println("5.- Salir del programa");
			menu1 = scn.nextInt();
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
				salir(scn, num1);
				break;

			default:
				System.out.println("Opción inválida; ingrese de nuevo\n");
				break;
			}
		}while (menu1 != 5);
	};
	
	public static void suma(Scanner scn, int num1, int num2) {
		System.out.println("\nIngrese dos números");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		int suma = num1+num2;
		System.out.println("La suma de los números es " + suma);
	};
	
	public static void resta(Scanner scn, int num1, int num2) {
		System.out.println("\nIngrese dos números");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		int resta = num1-num2;
		System.out.println("La resta de los números es " + resta);
	};
	
	public static void mult(Scanner scn, int num1, int num2) {
		System.out.println("\nIngrese dos números");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		int producto = num1*num2;
		System.out.println("El producto de los números es " + producto);
	};
	
	public static void div(Scanner scn, int num1, int num2) {
		System.out.println("\nIngrese dos números");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		double cociente = (double) num1/num2;
		System.out.println("El cociente de los números es " + cociente);
	};
	
	public static void salir(Scanner scn, int num1) {
		System.out.println("\n¿De verdad quiere dejar de utilizar este software?\nIngrese 1 (Si) o 2 (No)");
		num1 = scn.nextInt();
		while (num1>2 || num1<1){
			System.out.println("Opción inválida, ingrese de nuevo");
			num1 = scn.nextInt();
		}
		if (num1 == 1){
			System.out.println("\n//////Gracias por usar este programa//////");
		}
		if (num1 == 2){
			menu(scn);
		}
	};
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		menu(scn);
	}
}
