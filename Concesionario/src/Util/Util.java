/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author michael
 */
public class Util {

	public static double pedirDouble(String texto) {
		Scanner teclado = new Scanner(System.in);
		boolean correcto = false;
		double n1 = 0;
		do {
			System.out.print(texto);
			if (teclado.hasNextDouble()) {
				n1 = teclado.nextDouble();
				correcto = true;
			} else {
				System.out.println("Error, introduzca un número decimal!");
			}
			teclado.nextLine();
		} while (!correcto);
		return n1;
	}

	public static float pedirFloat(String texto) {
		Scanner teclado = new Scanner(System.in);
		boolean correcto = false;
		float n1 = 0;
		do {
			System.out.print(texto);
			if (teclado.hasNextFloat()) {
				n1 = teclado.nextFloat();
				correcto = true;
			} else {
				System.out.println("Error, introduzca un número decimal!");
			}
			teclado.nextLine();
		} while (!correcto);
		return n1;
	}

	public static int pedirInt(String texto) {
		Scanner teclado = new Scanner(System.in);
		boolean correcto = false;
		int num = 0;
		do {
			System.out.print(texto);
			if (teclado.hasNextInt()) {
				num = teclado.nextInt();
				correcto = true;
			} else {
				System.out.println("Error, introduzca un número entero!");
			}
			teclado.nextLine();
		} while (!correcto);

		return num;
	}

	public static int pedirIntPositivo(String texte) {
		int quant = 1;
		do {
			quant = Util.pedirInt(texte);
			if (quant < 0) {
				System.out.println("Error!! Quiero un número positivo");
			}
		} while (quant < 0);
		return quant;
	}

	public static float pedirFloatPositivo(String texte) {
		float quant = 1;
		do {
			quant = Util.pedirFloat(texte);
			if (quant < 0) {
				System.out.println("Error!! Quiero un número positiu");
			}
		} while (quant < 0);
		return quant;
	}

	public static String pedirString(String texto) {
		Scanner teclado = new Scanner(System.in);
		String str;
		do {
			System.out.print(texto);
			str = teclado.nextLine();
			if (str.length() == 0) {
				System.out.println("Error");
			}
		} while (str.length() == 0);
		return str;
	}
}
