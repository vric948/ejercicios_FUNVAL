package ejercicios_FUNVAL;

import java.util.Scanner;

public class ejercicio1_1 {
	public static void main(String[]arg) {
		Scanner input = new Scanner(System.in);
		int nuevaConversion = 1;
		
		while (nuevaConversion == 1) {
			System.out.println("Si desea convertir grados Fahrenheit a grados Celcius ingrese: 1. Si desea convertir grados Fahrenheit a Celsius ingrese: 2. Si desea salir ingrese: 0");
			int tipoConversion = input.nextInt();
		
			if (tipoConversion == 1) {
				System.out.println("Ingrese grados Fahrenheit");
				double gradosF = input.nextDouble();
				double finalC = (gradosF - 32)/1.8;
				System.out.println(gradosF + "grados Fahrenheit es igual a " + finalC + " grados Celcius");
			} else if (tipoConversion == 2) {
				System.out.println("Ingrese grados Celsius");
				double gradosC = input.nextDouble();
				double finalF = (gradosC * 1.8) + 32;
				System.out.println(gradosC + " grados Celcius es igual a " + finalF + " grados Fahrenheit");
			} else if (tipoConversion == 0) {
				System.out.println("Gracias, el programa se cerrará en breve");
				break;
			} else {
				System.out.println("Opción invalida. El programa se cerrará");
				break;
			}
		
			System.out.println("Si desea hacer otra conversion ingrese: 1. Si desea salir ingrese 0");
			nuevaConversion = input.nextInt();
			
			if (nuevaConversion ==  0) {
				System.out.println("Gracias, el programa se cerrará en breve");
			} else {
				System.out.println("Opción invalida. El programa se cerrará");
			}
		}
		input.close();
	}
}