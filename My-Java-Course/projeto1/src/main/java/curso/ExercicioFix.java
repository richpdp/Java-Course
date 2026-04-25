package curso;

import java.util.Locale;

public class ExercicioFix {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        Integer age = 30;
        Integer code = 5290;
        Character gender = 'F';

        Double price1 = 2100.0;
        Double price2 = 650.50;
        Double measure = 53.234567;

        System.out.printf("Products: %n" +
                "%s, witch price is $%.2f%n" +
                "%s, witch price is $%.2f%n%n" +
                "Record: %d years old, code %d and gender: %c%n%n" +
                "Measue with eight decimal places: %.8f%n" +
                "Rouded(three decimal places): %.3f%n", product1, price1, product2, price2, age, code, gender, measure, measure);
        
                System.out.printf(Locale.US, "US decimal point: %.3f", measure);
    }
}
