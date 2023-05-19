package CodeWars;

public class Ex14 {
    public static int saleHotdogs(final int n){
        if(n < 5) return n * 100;
        if(n >= 5 && n < 10) return n * 95;
        return n * 90;
    }

    public static void main(String[] args) {
        System.out.println(saleHotdogs(1));
        System.out.println(saleHotdogs(4));
        System.out.println(saleHotdogs(5));
        System.out.println(saleHotdogs(9));
        System.out.println(saleHotdogs(10));
        System.out.println(saleHotdogs(100));
    }
}
