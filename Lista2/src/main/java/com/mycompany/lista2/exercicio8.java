package com.mycompany.lista2;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args)
{
Scanner numeros = new Scanner(System.in);

int[] listaDeNumeros = new int[6];
          
           for (int i = 1; i < listaDeNumeros.length; i++) 
           {
	           System.out.print("Coloque "+ i + "° numero: "); 
	           listaDeNumeros[i] = (numeros.nextInt());
	       }
           Arrays.sort(listaDeNumeros);
           
           // Lista o Array em ordem crescente
          System.out.print("Ordem crescente:    "); 
       	  for (int j = 1; j < listaDeNumeros.length; j++) 
       	  {
       		System.out.print(listaDeNumeros[j]+ "  ");       		
		  }
       	  
       	           
        	 
}

}