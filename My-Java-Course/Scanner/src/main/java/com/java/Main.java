package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        Integer idade;
        Double salario;
        Character sexo;

        System.out.println("Digite seu nome: ");
        System.out.println("Digite sua idade: ");
        System.out.println("Digite seu salário: ");
        System.out.println("Digite seu sexo: ");
        nome = sc.nextLine();
        idade = sc.nextInt();
        salario = sc.nextDouble();
        sexo = sc.next().charAt(0);
        System.out.printf("Olá %s, você tem %d anos e seu sexo é %c, você ganha %.4f, uau, isso é bem legal", nome, idade, sexo, salario);


        sc.close();
    }
}
