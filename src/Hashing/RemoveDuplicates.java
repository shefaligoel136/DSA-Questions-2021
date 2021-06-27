package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicate(int a[]){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],true);
                output.add(a[i]);
            }
        }

        return  output;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,2,1,5,6,4};
        ArrayList<Integer> output = removeDuplicate(a);
        for(int i: output){
            System.out.println(i);
        }
    }
}
