package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
         double altura, peso;
        String sexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque a Altura: ");
        altura = sc.nextDouble();
        System.out.println("Coloque o Sexo: F - Feminino /M - Masculino.");
        sexo = sc.next();

        if (sexo.equals("F") || sexo.equals("f")) {
            peso = (62.1 * altura) - 44.7;
        } else {
            peso = (72.7 * altura) - 58;
        }
        System.out.println("Peso ideal: " + String.format("%.2f", peso));

    }
}