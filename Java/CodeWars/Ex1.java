package CodeWars;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        ex.cockroachSpeed(1.08);
    }

    public int cockroachSpeed(double x){

        double number = (x * 27.7778);
        int ms = (int)number;
        System.out.println(ms);
        return ms;
    }
}
