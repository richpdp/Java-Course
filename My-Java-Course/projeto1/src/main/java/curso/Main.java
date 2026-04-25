package curso;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

            Double valor = 12.56789;
            System.out.println(String.format("%.2f", valor));
            //ou podemos fazer desse jeito
            //se eu quiser colocar um "." ao invés da vígula, preciso dar o seguinte comando abaixo
            Locale.setDefault(Locale.US);
            System.out.printf("%.2f%n", valor);
            System.out.printf("O valor final é: " + valor + " metros%n");
            System.out.printf("Resultado = %.2f metros%n", valor);
    }
}
