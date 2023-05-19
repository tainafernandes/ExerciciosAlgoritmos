package CodeWars;

import java.util.Arrays;

public class Ex19 {
    public static int grow(int[] x){
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }
}
