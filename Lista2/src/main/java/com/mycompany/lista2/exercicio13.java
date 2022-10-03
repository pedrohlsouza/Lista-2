package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        double area, medida, altura;
        System.out.println("Quantos lados tem?");
        lado = sc.nextInt();
        System.out.println("Informe a medida do lado");
        medida = sc.nextDouble();

        switch (lado) {
            case 3 -> {
                altura = (medida * 1.7) / 2;
                area = medida * altura / 2;
                System.out.println("É um triangulo");
                System.out.println("Com a Aréa de : " + String.format("%.2f", area) + "cm²");
            }
            case 4 -> {
                System.out.println("É um quadrado");
                area = medida * medida;
                System.out.println("Com a Área: " + String.format("%.2f", area) + "cm²");
            }

            case 5 -> System.out.println("É um pentagono");
        }
    }
}