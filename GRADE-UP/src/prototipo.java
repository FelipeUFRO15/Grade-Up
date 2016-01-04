import java.util.Scanner;


public class prototipo {
	//Integrante Eliminado Alex Padilla.
	/**
	 * Imprime el menú por consola.
	 * No recibe parámetros.
	 * No retorna valores.
	 */
	public static void mostrarFunciones() {
		System.out.println("\n***GRADE-UP BETA***");
		System.out.println("Seleccione una función:");
		System.out.println("1) Ingresar 10 notas");
		System.out.println("2) Mostrar sus notas");
		System.out.println("3) Calcular el promedio");
		System.out.println("4) Ver comentarios sobre el prototipo");
		System.out.println(" Ingrese cualquier número para salir");
	}

	/**
	 * Ejecuta las distintas funciones del prototipo de GRADE-UP
	 * No recibe parámetros ni retorna datos
	 */
	public static void seleccionarFunción() {
		boolean menú = true;
		double[] main_array = new double[10];
		do {
			mostrarFunciones();
			switch (leerEnteros()) {
			case 1:
				main_array = llenarArreglo();
				break;

			case 2:
				mostrarArreglo(main_array);
				break;

			case 3:
				System.out.println("\nEl promedio de las notas es: "
						+ calcularPromedio(main_array));
				break;

			case 4:
				comentarios();
				break;

			default:
				salir();
				menú = false;
				break;
			}
		} while (menú);
	}

	/**
	 * Valida números enteros
	 * Retorna un int
	 * No recibe parámetros
	 * @return
	 */
	public static int leerEnteros() {
		Scanner leer = new Scanner(System.in);
		int numb = 0;
		String cadena = "";
		boolean bool = true;
		System.out.println("\nIngrese un número");
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
	}

	/**
	 * Valida las notas 
	 * Retorna un double
	 * No recibe parámetros
	 * @return
	 */
	public static double leerNotas() {
		double nota = 0.0;
		String cadena = "";
		Scanner scn = new Scanner(System.in);
		System.out
				.println("Ingrese una nota (Ejemplo de formato: 6.5, 4.3, 5.0, 7)");
		boolean mientras = true;
		do {
			cadena = scn.nextLine();
			if (cadena.matches("[1-6]{1,1}(\\.{1,1}[0-9]{1,}){0,1}") || cadena.matches("7")) {
				nota = Double.parseDouble(cadena);
				mientras = false;
			} else
				System.out.println("Nota inválida\nIngrese de nuevo");
		} while (mientras);
		return nota;
	}

	/**
	 * Llena el arreglo con 10 notas
	 * usa el método leerNotas
	 * Retorna el arreglo
	 * @return
	 */
	public static double[] llenarArreglo() {
		double[] arreglo = new double[10];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = leerNotas();
		}
		return arreglo;
	}

	/**
	 * Recibe el arreglo de notas
	 * Lo muestra por consola
	 * @param arreglo
	 */
	public static void mostrarArreglo(double[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " | ");
		}
		System.out.println();
	}

	/** 
	 * Recibe el arreglo
	 * Suma las notas y calcula el promedio
	 * Devuelve un double con el promedio
	 * @param arreglo
	 * @return
	 */
	public static double calcularPromedio(double[] arreglo) {
		double prom = 0.0;
		double total = 0.0;
		double cantidad = 0.0;
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != 0) {
				total = total + arreglo[i];
				cantidad++;
			}
		}
		prom = (total / cantidad);
		return prom;
	}

	/**
	 * Muestra comentarios sobre el prototipo de GRADE-UP
	 */
	public static void comentarios() {
		System.out.println("Primera versión de GRADE-UP:");
		System.out
				.println("-Se implementaron las funciones de ingresar notas \n (máximo de 10 para esta versión), mostrar el arreglo \n de notas y calcular su promedio");
		System.out
				.println("-Solo se pueden ingresar 10 notas a la vez, al hacer esto las 10 anteriores \n se pierden");
		System.out
				.println("-En el futuro implementaremos las funciones de calcular notas restantes \n necesarias, guardar varios arreglos a la vez y la interfaz gráfica");
	}

	/**
	 * Pregunta al usuario si desea salir del prototipo
	 */
	public static void salir() {
		System.out
				.println("\n¿De verdad quiere salir?\n- 1 = salir\n- Otro número = volver");
		if (leerEnteros() == 1) {
			System.out
					.println("\n***Gracias por usar este programa***\n   -Felipe Acuña\n"
							+ "   -Matías Gutierrez\n    -Marcos Pinilla"
							+ "\n   Primera versión de GRADE-UP\n   Proyecto de la asignatura de Fundamentos de programación");
		} else {
			seleccionarFunción();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleccionarFunción();

	}
}
