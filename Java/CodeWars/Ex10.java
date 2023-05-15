package CodeWars;

public class Ex10 {
    public static boolean isEven(double n) {
        return (n % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isEven(0));
        System.out.println(isEven(0.5));
        System.out.println(isEven(1));
        System.out.println(isEven(2));
        System.out.println(isEven(-4));
    }
}
