package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3 ;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10.0;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();
		}

	}