package com.curso;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero1;
        Integer numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Os números não são múltiplos");
        }
    }
}
