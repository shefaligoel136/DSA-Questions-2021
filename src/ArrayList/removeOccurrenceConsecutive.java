package ArrayList;

import java.util.ArrayList;

public class removeOccurrenceConsecutive {

    public static ArrayList<Integer> remove(int arr[]){
        ArrayList<Integer> aL = new ArrayList<>();
        aL.add(arr[0]);
//        int size = 0;
        for(int i=1;i<arr.length;i++){
//            size = aL.size(); size takes 1 sec more therefore use arr[i] and arr[i-1]
            if(arr[i] != arr[i-1]){
                aL.add(arr[i]);
            }
        }
//        for(int i:aL){
//            System.out.println(i);
//        }
        return aL;
    }

    public static void main(String[] args) {
        int arr[] = {10,10,20,20,20,30,40,10};
        ArrayList<Integer> ans = remove(arr);
        for(int i:ans){
            System.out.println(i);
        }
    }
}
