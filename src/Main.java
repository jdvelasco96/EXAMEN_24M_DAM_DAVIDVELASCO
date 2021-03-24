import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner esc = new Scanner (System.in);
		float numero = 0;
		System.out.println("Buenos dias Ceinmark, soy Juan David Velasco" + "\n"
				+ "Introduce un número para averiguar si es primo o no:\n" );
		
		numero =(float)esc.nextInt();
		
		if (numero %2 == 0 || numero %3 ==0 || numero %4 == 0) {
			System.out.println("el numero no es primo");
		}else  {
			System.out.println("el numero es primo");
		}
		
		
		
	}

}
