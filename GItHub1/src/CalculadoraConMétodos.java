
import java.util.Scanner;

/**
 * Felipe Acuña 
 * Ingeniería informática
 * Fundamentos de programación
 * Calculadora  con implementación de métodos
 * @author Felipe
 *
 */

public class CalculadoraConMétodos {

	/**
	 * Imprime el menú por consola 
	 * No recibe parámetros 
	 * No retorna valores
	 */
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

	/**
	 * Usa el método para leer números 
	 * Ejecuta las funciones de la calculadora mediante un switch
	 */
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
				System.err.println("Opción inexistente");
				break;
			}
		} while (menu);
	};

	/**
	 * Crea un scanner 
	 * Lee y valida todos los números ingresados 
	 * No recibe parámetros 
	 * Retorna un número entero
	 * @return
	 */
	public static int leerNums() {
		Scanner leer = new Scanner(System.in);
		int numb = 0;
		String cadena = "";
		boolean bool = true;
		System.out.println("Ingrese un número");
		do {
			cadena = leer.nextLine();
			if (cadena.matches("-{0,1}[0-9]{1,}")) {
				numb = Integer.parseInt(cadena);
				bool = false;
			} else {
				System.err.println("Caracter inválido\n- Ingrese de nuevo");
			}
		} while (bool);
		return numb;
	};

	/**
	 * Recibe dos enteros 
	 * Retorna su suma como un entero
	 * @param sum1
	 * @param sum2
	 * @return
	 */
	public static int sumar(int sum1, int sum2) {
		return (sum1 + sum2);
	};

	/**
	 * Recibe dos enteros 
	 * Retorna su resta como un entero
	 * @param minn
	 * @param sust
	 * @return
	 */
	public static int restar(int minn, int sust) {
		return (minn - sust);
	};

	/**
	 * Recibe dos enteros 
	 * Retorna su multiplicación como un entero
	 * @param fact1
	 * @param fact2
	 * @return
	 */
	public static int multiplicar(int fact1, int fact2) {
		return (fact1 * fact2);
	};

	/**
	 * Recibe dos enteros 
	 * Si el segundo es cero lo pide de nuevo
	 * Los transforma a double y los retorna en un double
	 * @param divn
	 * @param divs
	 * @return
	 */
	public static double dividir(int divn, int divs) {
		while (divs == 0) {
			System.err
					.println("Resultado indeterminado");
			System.out.print(" ");
			divs = leerNums();
		}
		return (double) ((double) divn) / ((double) divs);
	};

	/**
	 * Recibe dos números enteros 
	 * Retorna el mayor como un entero
	 * @param com1
	 * @param com2
	 * @return
	 */
	public static int comparar(int com1, int com2) {
		return Math.max(com1, com2);
	};

	/**
	 * Recibe dos enteros 
	 * Retorna en un entero el primero elevado al segundo
	 * @param base
	 * @param exp
	 * @return
	 */
	public static int elevar(int base, int exp) {
		return (int) Math.pow(base, exp);
	};

	/**
	 * Pregunta al usuario si desea salir de la aplicación 
	 * Cierra el programa o regresa al menú
	 */
	public static void salir() {
		System.out
				.println("\n¿De verdad quiere salir?\n- 1 = salir\n- Otro número = volver");
		if (leerNums() == 1) {
			System.out
					.println("\n***Gracias por usar este programa***\n   -Felipe Acuña");
		} else {
			leerOpciónMenú();
		}
	};

	public static void main(String[] args) {
		leerOpciónMenú();

	}

}
