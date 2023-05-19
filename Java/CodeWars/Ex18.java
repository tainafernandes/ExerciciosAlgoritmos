package CodeWars;

public class Ex18 {
    public static String MakeUpperCase(String str){
        return (str == str.toUpperCase()) ? str.toLowerCase() : str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(MakeUpperCase("HELLO"));
        System.out.println(MakeUpperCase("oi"));
    }
}
