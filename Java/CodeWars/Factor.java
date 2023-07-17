package CodeWars;

public class Factor {
    public static boolean checkForFactor(int base, int factor) {
        return (base % factor == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(checkForFactor(10,2));
        System.out.println(checkForFactor(63,7));
        System.out.println(checkForFactor(7,2));
        System.out.println(checkForFactor(24612,3));
    }
}
