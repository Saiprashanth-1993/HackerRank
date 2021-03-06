import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        printMultiples(N);
    }
    public static void printMultiples(int N) {
        if (N < 2 || N > 20) {
            System.out.println("The number is out of range");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N*i));
        }
    }
}

