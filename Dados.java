package eggd;

import java.util.Scanner;
import java.util.Random;

public class Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner (System.in);
		Random azar = new Random ();
		
		int dado = 0;
		int usuario = 0;
		int contador = 0;

		
		dado = azar.nextInt(6) + 1;
			
		System.out.println("ingrese un numero al azar:");
		usuario = tec.nextInt();
		
		
		if (usuario == dado) {
			System.out.println("tu ganaste");
			contador++;
		}
		else {
			System.out.println("gana la maquina");
		
		}
		
		if (contador == 10) {
			System.out.println("tu vas ganando");
		}
		else {
			System.out.println("la maquina va ganando");
		}
		
		
		

	}

}
