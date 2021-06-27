package Hashing;

import java.util.HashMap;
import java.util.Set;

public class MaxFrequencyNumber {

    public static int maxFrequencyNumber(int[] arr){
        int max = 0,maxKey = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Integer j : arr){
            if(map.get(j)>max) {
               // System.out.println(j + " , " + map.get(j));
                max = map.get(j);
                maxKey = j;
            }
        }

        return maxKey;

    }

    public static void main(String[] args) {
        int a[] = {1,2,2,1,2,1};
        int max = maxFrequencyNumber(a);
        System.out.println(max);
    }
}
