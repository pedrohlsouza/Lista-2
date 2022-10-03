package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorA;
        double valorB;
        double valorC;
        
        
        System.out.println("Coloque o Valor A");
        valorA = sc.nextInt();
        System.out.println("Coloque o Valor B");
        valorB = sc.nextInt();
        System.out.println("Coloque o Valor C");
        valorC = sc.nextInt();
        
        if(valorA + valorB > valorC ){
            System.out.println("O valor de A + B é maior que C");
        }else{
            System.out.println("O valor de A + B é menor que C");
        }
        
        
        
    }
}
