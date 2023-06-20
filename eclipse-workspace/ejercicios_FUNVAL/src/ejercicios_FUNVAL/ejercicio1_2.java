package ejercicios_FUNVAL;

import java.util.Scanner;

public class ejercicio1_2 {
	public static void main(String[]arg) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bienvenido. Ingrese la cantidad de metros que mide la base del triangulo:");
		double baseTriang = input.nextDouble();
		
		System.out.println("Ahora ingrese la cantidad de metros que mide la altura del triangulo:");
		double alturaTriang = input.nextDouble();
		
		double areaTriang = (baseTriang * alturaTriang)/2;
		
		System.out.println("El área del triangulo es: " + areaTriang + " m^2");
		
		input.close();
	}
}
