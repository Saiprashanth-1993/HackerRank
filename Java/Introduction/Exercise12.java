import java.io.*;
import java.util.Scanner;
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int date = in.nextInt();
        int year = in.nextInt();
        
        LocalDate day = LocalDate.of(year, month, day);
        System.out.println(day.getDayOfWeek());
    }
}

