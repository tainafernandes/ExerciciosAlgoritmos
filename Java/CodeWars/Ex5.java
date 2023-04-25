package CodeWars;

import java.util.Arrays;

public class Ex5 {

    public static String abbrevName(String name) {
        String[] initials = name.split(" ");
        return (initials[0].charAt(0) + "." + initials[1].charAt(0)).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Taina Fernandes"));
    }
}
