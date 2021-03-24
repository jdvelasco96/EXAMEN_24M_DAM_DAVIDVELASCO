import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner esc = new Scanner (System.in);
		float numero = 0;
		System.out.println("Buenos dias Ceinmark, soy Juan David Velasco" + "\n"
				+ "Introduce un número para averiguar si es primo o no:\n" );
		
		numero =(float)esc.nextInt();
		int contador = 0;
		String div= "";
		
		for (int i = 1; i < numero; i++) {
			
			if ((numero/i) == 1) {
				contador++;
				div += i + " ";
			}
	
		}
		if (contador > 1) {
			System.out.println("el numero no es primo");
			System.out.println("sus divisores son "+ div);
		}else {
			System.out.println("el numero es primo");
		}
		
	}

}
