package Exercism;

import static java.util.Optional.ofNullable;

public class Twofer {
    public String twofer(String name) {
        return String.format("One for %s, one for me.", ofNullable(name).orElse("you"));
    }

}

//https://www.programacaoprogressiva.net/2012/07/java-classe-string.html