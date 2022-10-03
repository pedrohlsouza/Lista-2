package com.mycompany.lista2;
import java.util.Scanner;


public class exercicio6 {

    public static void main(String[] args) {
        double num1, num2, num3, maior = 0, meio = 0, menor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque três números aleatórios para fazer a ordem decrescente deles");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        if (num3 < num2 && num2 < num1) {
            maior = num1;
            meio = num2;
            menor = num3;
        } else if (num2 < num3 && num3 < num1) {
            maior = num1;
            meio = num3;
            menor = num2;
        } else if (num1 < num3 && num3 < num2) {
            maior = num2;
            meio = num3;
            menor = num1;
        } else if (num3 < num1 && num1 < num2) {
            maior = num2;
            meio = num1;
            menor = num3;
        } else if (num1 < num2 && num2 < num3) {
            maior = num3;
            meio = num2;
            menor = num1;
        } else if (num2 < num1 && num1 < num3) {
            maior = num3;
            meio = num1;
            menor = num2;
        }
        System.out.println(maior + ", " + meio + " , " + menor);
    }
}