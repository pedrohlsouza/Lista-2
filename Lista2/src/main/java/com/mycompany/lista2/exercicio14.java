package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {
         int lado;
         Scanner sc = new Scanner(System.in);
        double area, medida, altura;
        System.out.println("Quantos lados tem?");
        lado = sc.nextInt();
        System.out.println("Informe a medida do lado");
        medida = sc.nextDouble();

        if (lado < 3) {
            System.out.println("não é um poligono");
        } else if (lado > 5) {
            System.out.println("poligono não identificado");
        }
        switch (lado) {
            case 3:
                // Considerando raiz de 3 como 1.7
                altura = (medida * 1.7) / 2;
                area = medida * altura / 2;
                System.out.println("É um triangulo");
                System.out.println("Com a Aréa: " + String.format("%.2f", area) + "cm²");
                break;
            case 4:
                System.out.println("É um quadrado");
                area = medida * medida;
                System.out.println("Com a Área: " + String.format("%.2f", area) + "cm²");
                break;
            case 5:
                System.out.println("É um pentagono");
                break;
        }
    }
}
