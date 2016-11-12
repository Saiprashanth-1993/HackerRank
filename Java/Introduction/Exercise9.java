import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int i = 1;
        while(in.hasNext()) {
            System.out.printf("%d %s\n", i++, in.next());
        }
    }
}
