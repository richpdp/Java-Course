package curso;

import java.util.Locale;

public class Atividade {

    public static void main(String[] args) {

        Integer idade = 41;
        String nome = "Maria";
        Double renda = 4000.0;

        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);

    }

}
