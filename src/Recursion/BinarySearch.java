package Recursion;

import java.util.Scanner;

public class BinarySearch {

    public static int binary(int arr[],int n,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]<n){
            return binary(arr,n,mid+1,end);
        }
        else if(arr[mid]>n){
            return binary(arr,n,0,mid-1);
        }
        else{
            return mid;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter array elements");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int n = sc.nextInt();

        int found = binary(arr,n,0,arr.length-1);
        if(found != -1)
            System.out.println(found);
        else
            System.out.println("Not Found");
    }
}
