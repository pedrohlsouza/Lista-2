package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        String tipo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os três lados do triângulo: ");
        lado1 = sc.nextDouble();
        lado2 = sc.nextDouble();
        lado3 = sc.nextDouble();
        if (!(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2)) {
            throw new RuntimeException("Não é um triângulo");
        }

        if (lado1 == lado2 && lado2 == lado3) {
            tipo = "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }

        System.out.println("Tipo: " + tipo);

    }
}