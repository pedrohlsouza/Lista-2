package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
            int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque um número");
        numero = sc.nextInt();
        
        if (numero > 0) {
            numero *= 2;
            System.out.println( "numero iformado  > 0 o resultado é : " + numero);
        } else if (numero < 0) {
            numero *= 3;
            System.out.println( "numero iformado  < 0 o resultado é : " + numero);
        }
        
    }
    
}
