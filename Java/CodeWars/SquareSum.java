package CodeWars;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(x -> x * x).sum();
    }
//    public static int squareSum(int[] n) {
//        int sum = 0;
//        for(int number : n){
//            sum += number * number;
//        }
//        return sum;
//    }
}
