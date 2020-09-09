package PacoteJava;
/*2-	Faça um programa que entre com três números e coloque em ordem crescente.*/

import java.util.Scanner;

public class Exercicio2  
{
		public static void main(String args[])
		{
			Scanner ler = new Scanner(System.in);
			int n1, n2, n3, x;
			
			//vamos supor números diferentes
			
			System.out.println("Entre com o valor: ");
			n1 = ler.nextInt();
			
			System.out.println("Entre com o valor: ");
			n2 = ler.nextInt();

			System.out.println("Entre com o valor: ");
			n3 = ler.nextInt();
			
			if(n1>n2)
			{
				x = n1;
				n1 = n2;
				n2 = x;
			}
			if(n1>n3)
			{
				x = n1;
				n1 = n2;
				n3 = x;
			}
			if(n2 > n3)
			{
				x = n2;
				n1 = n2;
				n3 = x;
			}
			
			System.out.println("Ordem crescente: "+n1+", "+n2+", "+n3+"");

		
		}

}
