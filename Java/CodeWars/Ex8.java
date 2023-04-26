package CodeWars;

public class Ex8 {
    public static int opposite(int number) {
        return (number > 0) ?  number * (-1) : number * (-1);
    }

    public static void main(String[] args) {
        System.out.println(opposite(-34));
    }

    /* Very simple, given an integer or a
     floating-point number, find its opposite.
    */
}
