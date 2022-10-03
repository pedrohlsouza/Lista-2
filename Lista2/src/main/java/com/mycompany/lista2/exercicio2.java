package com.mycompany.lista2;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        String sexo;
        String estadoCivil;
        int anos;
        
        
        System.out.println("Coloque o nome: ");
        nome = sc.next();
        System.out.println("Coloque o Sexo(F - Feminino ou M - Masculino): ");
        sexo = sc.next();
        System.out.println("Coloque o estado Civil (Casada, solteira, divorciada ou viuva ): ");
        estadoCivil = sc.next();
        
        if(sexo.equals("F") || sexo.equals("f") && estadoCivil.equals("Casada")||estadoCivil.equals("casada")||estadoCivil.equals("CASADA")){
            System.out.println("Quantos anos de casada ? ");
            anos = sc.nextInt();
            System.out.println("Obrigado pelas informações  !!! ");
        }else{
            System.out.println("Parabéns, você não é uma mulher casada !!!");                
        }
        
       
        
        
        
    }
}