package CodeWars;

public class Ex13 {
    public static String even_or_odd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(even_or_odd(6));
        System.out.println(even_or_odd(7));
        System.out.println(even_or_odd(0));
        System.out.println(even_or_odd(-1));
    }
}
