package com.curso;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Número negativo");
        }  else {
            System.out.println("Número positivo");
        }

    }
}
