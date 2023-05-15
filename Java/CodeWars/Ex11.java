package CodeWars;

public class Ex11 {
    public static String solution(String str) {
        String phrase = new StringBuilder(str).reverse().toString();
        return phrase;
    }

    public static void main(String[] args) {
        System.out.println(solution("world"));
        System.out.println(solution("word"));
    }
}
