package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Double num1,num2,num3, soma;
        System.out.println("Informe o 1° ângulo:");
        num1 =sc.nextDouble();
        System.out.println("Informe o 2° ângulo:");
        num2 =sc.nextDouble();
        System.out.println("Informe o 2° ângulo:");
        num3 =sc.nextDouble();
        soma = num1 + num2 + num3;
        if(soma==90){
            System.out.println("triangulo Retangulo");
        }else if(soma>90){
            System.out.println("triangulo Obtusângulo");
        }else{
            System.out.println("triangulo Acutângulo");
        }
    }
}
