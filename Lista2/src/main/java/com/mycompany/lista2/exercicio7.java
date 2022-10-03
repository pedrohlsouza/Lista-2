package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
          double num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque um numero");
        num1 = sc.nextDouble();
        if (num1 % 2 == 0) {
            num1 += 5;
            System.out.println("Somou 5 pois é par: " + num1);
        } else {
            num1 += 8;
            System.out.println("Somou 8 pois é impar: " + num1);
        }
        

    }
}