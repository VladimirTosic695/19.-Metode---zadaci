package metodeZadaci;

import java.io.*;

public class Primer19 {
	// Metoda za izračunavanje rastojanja između dve tačke
	public static double rastojanje(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

	}

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Deklarisanje podataka
		int k;
		double min, x1, x2, y1, y2, xm1, xm2, ym1, ym2;
		// Unos broja duži

		System.out.print("Unesite broj duži k: ");
		k = Integer.parseInt(ulaz.readLine());

		// Unos koordinata prve duži

		System.out.println("Unesite koordinate 1. duži:");
		System.out.print("x1 = ");
		x1 = Double.parseDouble(ulaz.readLine());
		System.out.print("y1 = ");
		y1 = Double.parseDouble(ulaz.readLine());
		System.out.print("x2 = ");
		x2 = Double.parseDouble(ulaz.readLine());
		System.out.print("y2 = ");
		y2 = Double.parseDouble(ulaz.readLine());
	}

	//Štampanje rezultata 
	System.out.println("Koordinate duži sa najkraćim rastojanjem su: ");
	System.out.println("x1 = " + x1 + " y1 = " + y1 + " x2 = " + x2 + " y2 = " + y2 + " i ima vrednost " + min);
	}
}