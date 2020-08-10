package pl.javowiec;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // Zmienna testowa
        String test = "javowiec";
        System.out.println("Test variable: " + test);

        // Przykład użycia Optional.orElse
        System.out.println("[1] Optional.orElse example");
        String resultOrElse = Optional.ofNullable(test).orElse(getDefault());
        System.out.println("Optional.ofNullable(test).orElse(getDefault()) returns: " + resultOrElse);

        // Przykład użycia Optional.orElseGet
        System.out.println("[2] Optional.orElseGet example");
        String resultOrElseGet = Optional.ofNullable(test).orElseGet(Main::getDefault);
        System.out.println("Optional.ofNullable(test).orElseGet(Main::getDefault) returns: " + resultOrElseGet);
    }

    private static String getDefault() {
        // Zwrócenie domyślnego napisu
        System.out.println("Main.getDefault() method has been invoked");
        return "default";
    }

}
