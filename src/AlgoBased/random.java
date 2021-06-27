package AlgoBased;/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class random {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        int n = sc.nextInt();
        String[] p = new String [n];
        for(int i = 0;i<n;i++){
            p[i] = sc.next();
        }
        for(int i = 0;i<n;i++){
            System.out.println(p[i]);
        }
        int j,k;
        for(int i=0;i<n;i++){
            k =0;
            j =0;
            while(j<p[i].length() && k<v.length()){
                if(p[i].charAt(j) == v.charAt(k)) {
                    j++;
                }
                k++;


            }
            System.out.println(k);
            if(j==p[i].length()){
                System.out.println("POSITIVE");
            }else{
                System.out.println("NEGATIVE");
            }
        }

    }
}

/*
coronavirus
3
abcde
crnas
onarous

 */