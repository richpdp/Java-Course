package com.curso;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            Double cod1 = 4.00;
            Double cod2 = 4.50;
            Double cod3 = 5.00;
            Double cod4 = 2.00;
            Double cod5 = 1.50;

            Integer codigo = sc.nextInt();
            Integer quantidade = sc.nextInt();

            if (codigo == 1) {
                System.out.println("A conta deu " + cod1 * quantidade);
            }  else if (codigo == 2) {
                System.out.println("A conta deu " + cod2 * quantidade);
            }  else if (codigo == 3) {
                System.out.println("A conta deu " + cod3 * quantidade);
            }  else if (codigo == 4) {
                System.out.println("A conta deu " + cod4 * quantidade);
            }  else if (codigo == 5) {
                System.out.println("A conta deu " + cod5 * quantidade);
            }
        }

}
