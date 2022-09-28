package parinpar;

import java.util.Scanner;

public class ParInpar {

	public static void main(String[] args) {
		/*Escribir un programa que pida un número al usuario
		e indique mediante un literal booleano (true o false) si el número es par.*/
		
		//Declaramos las variables que vamos a necesitar
		int numeroUser;
		int comparacion;
		
		//llamamos al Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos el numero al usuario
		System.out.println("Introduzca un numero: ");
		
		//Scaneamos el numero
		numeroUser = sc.nextInt();
		
		comparacion = numeroUser % 2;
		
		System.out.print("Es par?: ");
		System.out.print(comparacion !=1);
		
	
		
		sc.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
