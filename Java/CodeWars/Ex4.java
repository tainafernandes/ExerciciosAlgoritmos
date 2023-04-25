package CodeWars;

public class Ex4 {
    static String greet(String name, String owner) {
        return (name.equals(owner)) ? "Hello boss" : "Hello guest";
    }
    public static void main(String[] args) {
        System.out.println(greet("Ben", "Ben"));
        System.out.println(greet("Maria", "Maria"));
    }
}
