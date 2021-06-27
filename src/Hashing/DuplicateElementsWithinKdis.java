package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateElementsWithinKdis {

    public static void find(int arr[],int k){
        int d;
        HashMap<Integer,Boolean> a = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
              d = i - map.get(arr[i]);
              if(d == k){
                  a.put(arr[i],true);
              }else{
                  a.put(arr[i],false);
              }
            }else{
                map.put(arr[i],i);
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,5,3,4,2,4,3};
        int k = 2;
        find(arr,k);
    }
}
