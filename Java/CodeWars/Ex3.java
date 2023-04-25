package CodeWars;

public class Ex3 {

    public static String rps(String p1, String p2) {
        if(p1 == "rock" && p2 == "paper") return "Player 2 won!";
        if(p1 == "paper" && p2 == "rock") return "Player 1 won!";
        if(p1 == "rock" && p2 == "rock") return "Draw!";
        if(p1 == "paper" && p2 == "scissors") return "Player 2 won!";
        if(p1 == "scissors" && p2 == "paper") return "Player 1 won!";
        if(p1 == "paper" && p2 == "paper") return "Draw!";
        if(p1 == "scissors" && p2 == "rock") return "Player 2 won!";
        if(p1 == "rock" && p2 == "scissors") return "Player 1 won!";
        return "Draw!";
    }


    public static void main(String[] args) {
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("paper", "paper"));
        System.out.println(rps("rock", "rock"));
    }
}
