package Recursion;

import java.util.Scanner;

public class SortedArray {
    public static int isSorted(int arr[],int l){
        if(arr.length-1==l){
            return 1;
        }
        if(arr[l]>arr[l+1]){
            return 0;
        }

          int  isit = isSorted(arr,l+1);

        return isit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 array elements");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int k = isSorted(arr,0);
        if(k==1)
            System.out.println("sorted");
        else
            System.out.println("Not sorted");
    }
}
