package com.curso;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double salario = sc.nextDouble();
        Double valor1 = salario * 0.28;
        Double valor2 = salario * 0.;

        if (salario > 4500) {
            System.out.printf("Você deve pagar %.2f de imposto", valor1);
        } else if ()
    }

}
