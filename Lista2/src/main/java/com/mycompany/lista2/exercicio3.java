package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        double a, b, c,delta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe A");
        a = sc.nextDouble();
        if (a == 0) {
            throw new RuntimeException("A = 0 não é equação do 2º grau");   
        }
        
        System.out.println("Informe B");
        b = sc.nextDouble();
        System.out.println("Informe C");
        c = sc.nextDouble();

        delta = ((Math.pow(b, 2)) - (4 * a * c)) / (2 * a);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais");
            throw new RuntimeException("A equação não possui raízes reais");
        } else if (delta == 0) {
            System.out.println("A equação possui uma raiz real");
        } else if (delta > 0) {
            System.out.println("A equação possui duas raízes reais");
        }
    }
}