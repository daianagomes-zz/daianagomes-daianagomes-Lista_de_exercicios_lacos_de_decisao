package PacoteJava;
/*1-1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

import java.util.*;

public class Exercicio1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, maior;
		
		//suponha n�meros diferentes
		
		System.out.println("Entre com o valor: ");
		n1 = ler.nextInt();
		
		System.out.println("Entre com o valor: ");
		n2 = ler.nextInt();

		System.out.println("Entre com o valor: ");
		n3 = ler.nextInt();
		
		if(n1>n2)
		{
			if(n1>n3)
			{
				maior = n1;
				System.out.println("Maior: "+maior+" ");
			}
			else
			{
				maior = n3;
				System.out.println("Maior: "+maior+" ");

			}

		}
		else 
		{
			if(n2>n3)
			{
				maior = n2;
				System.out.println("Maior: "+maior+" ");
			}
			else
			{
				maior = n3;
				System.out.println("Maior: "+maior+" ");

			}
			
		}
		
	}

}
