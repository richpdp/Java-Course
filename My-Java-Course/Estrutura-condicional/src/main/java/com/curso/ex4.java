package com.curso;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer horaInicial;
        Integer horaFinal;

        System.out.println("Digite a hora inicial (0-23): ");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final (0-23): ");
        horaFinal = sc.nextInt();
        if (horaInicial < 0 || horaFinal < 0 || horaInicial > 23 || horaFinal > 23) {
            System.out.println("Hora inválida");
        } else if (horaFinal > horaInicial) {
            System.out.println("O jogo durou " + (horaFinal - horaInicial) + " horas");
        } else if (horaInicial > horaFinal) {
            System.out.println("O jogo durou " + ((24 - horaInicial) + horaFinal) + " horas");
        }  else {
            System.out.println("O jogo durou 24 horas");
        }
    }

}
