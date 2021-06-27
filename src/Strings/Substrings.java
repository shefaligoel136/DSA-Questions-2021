package Strings;

import java.util.Scanner;

public class Substrings {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch = s.next().charAt(0);
        int nCh = 0, sum = 0;
        for (int i = 0; i < str.length(); ) {
            while (i < str.length() && str.charAt(i) != ch) {
                nCh = nCh + 1;
                i++;
            }
            if (nCh != 0) {
                sum = sum + (nCh * (nCh + 1) / 2);
                nCh = 0;
            }
            i++;

        }
        System.out.println(sum);
    }
}

