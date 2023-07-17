package CodeWars;

public class GetMiddle {
    public static String getMiddle(String word) {
        return word.length() % 2 == 0 ? word.substring(word.length() / 2 - 1, word.length() / 2 + 1) : word.substring(word.length() / 2, word.length() / 2 + 1);
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
    }
}
