package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio4 {
    
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque dois números");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            c = a + b;
            System.out.println("Resultado de A + B é : " + c);
        } else {
            c = a * b;
            System.out.println("Resultado de A * B é : " + c);
        }
        
    }
}