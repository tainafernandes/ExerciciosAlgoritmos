package CodeWars;

public class Ex17 {
    public static boolean isTriangle(int a, int b, int c){
        return ((a < b + c) && (b < a + c) && (c < a + b));
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(7,2,2));
    }
}
