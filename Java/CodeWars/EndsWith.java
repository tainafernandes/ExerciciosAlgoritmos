package CodeWars;

public class EndsWith {
    public static boolean solution(String str, String ending) {
        return (str.endsWith(ending)) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("sumo", "omo"));
    }
}
