package CodeWars;

public class Ex9 {
    public static String boolToWord(boolean b) {
        return (b == true) ? "Yes" : "No";
    };
    public static void main(String[] args) {
        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
        System.out.println(boolToWord(true));
    }
}
