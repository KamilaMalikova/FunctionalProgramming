package finalsection;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> printName = name -> {
            if (name.isBlank()) throw new IllegalArgumentException();
            System.out.println(name.toUpperCase());
            return name.toUpperCase();
        };
        printName.apply("Alex");

    }
}
