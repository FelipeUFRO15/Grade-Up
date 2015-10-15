

import java.util.Scanner;

public class CalculadoraConMétodos {

	public static void mostrarMenú() {
		System.out.println("\n//////MENÚ//////");
		System.out.println("1.- Sumar dos números");
		System.out.println("2.- Restar dos números");
		System.out.println("3.- Multiplicar dos números");
		System.out.println("4.- Dividir dos números");
		System.out.println("5.- Encontrar el mayor de dos números");
		System.out.println("6.- Elevar el primer número al segundo");
		System.out.println("7.- Salir del programa");
	};

	public static void leerOpciónMenú() {
		boolean menu = true;
		do {
			mostrarMenú();
			System.out.println("\nSeleccione una opción");
			switch (leerNums()) {
			case 1:
				System.out.println("\n///SUMA///");
				System.out.println("suma = " + sumar(leerNums(), leerNums()));
				break;

			case 2:
				System.out.println("\n///RESTA///");
				System.out.println("Resta = " + restar(leerNums(), leerNums()));
				break;

			case 3:
				System.out.println("\n///MULTIPLICACIÓN///");
				System.out.println("Producto = "
						+ multiplicar(leerNums(), leerNums()));
				break;

			case 4:
				System.out.println("\n///DIVISIÓN///");
				System.out.println("Cociente = "
						+ dividir(leerNums(), leerNums()));
				break;

			case 5:
				System.out.println("\n///COMPARACIÓN///");
				System.out.println("Mayor = "
						+ comparar(leerNums(), leerNums()));
				break;

			case 6:
				System.out.println("\n///POTENCIACIÓN///");
				System.out.println("Potencia = "
						+ elevar(leerNums(), leerNums()));
				break;

			case 7:
				salir();
				menu = false;
				break;

			default:
				System.out.println("Opción inexistente");
				break;
			}
		} while (menu);

	};

	public static int leerNums() {
		Scanner leer = new Scanner(System.in);
		String cadena = "";
		int numb = 0;
		boolean bool = true;
		System.out.println("Ingrese un número");
		do {
			cadena = leer.nextLine();
			if (cadena.matches("-{0,1}[0-9]{1,}")) {
				numb = Integer.parseInt(cadena);
				bool = false;
			} else
				System.out.println("Caracter inválido\n- Ingrese de nuevo");
		} while (bool);
		return numb;
	};

	public static int sumar(int sum1, int sum2) {
		return (sum1 + sum2);
	};

	public static int restar(int minn, int sust) {
		return (minn - sust);
	};

	public static int multiplicar(int fact1, int fact2) {
		return (fact1 * fact2);
	};

	public static double dividir(int divn, int divs) {
		return (double) ((double) divn) / ((double) divs);
	};

	public static int comparar(int com1, int com2) {
		return Math.max(com1, com2);
	};

	public static int elevar(int base, int exp) {
		return (int) Math.pow(base, exp);
	};

	public static void salir() {
		System.out
				.println("¿De verdad quiere salir?\n- 1 = salir\n- Otro número = volver");
		if (leerNums() == 1) {
			System.out.println("Gracias por usar este programa");
		} else
			leerOpciónMenú();
	};

	public static void main(String[] args) {
		leerOpciónMenú();

	}

}
