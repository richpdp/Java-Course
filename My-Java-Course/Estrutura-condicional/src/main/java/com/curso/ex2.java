package com.curso;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par");
        }  else {
            System.out.println("Número impar");
        }
    }

}
