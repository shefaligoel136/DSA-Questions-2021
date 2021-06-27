package Hashing;

import java.util.HashMap;
import java.util.Set;

public class PairSumTo_0 {

    public static int pairSum(int input[],int size){
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<size;i++){
            if(map.containsKey(input[i])){
                map.put(input[i],map.get(input[i])+1);
            }else{
                map.put(input[i],1);
            }
        }

        for(Integer j: input){
            if(j>0){
//                System.out.println(j+" "+map.get(j));
                if(map.containsKey(-j) && map.get(j)!=0){
//                    System.out.println("neg val "+ -j+" "+map.get(-j));

//                    if(map.get(j)<=map.get(-j))
//                        if(map.get(j)==1){
//                            count = count+1;
//                        }else{
//                            count = count + (map.get(j)*2);
//                        }
//
//                    else
//                        count = count + (map.get(-j)*2);

                    count = count + (map.get(j)*map.get(-j));

                    //count = count+map.get(j)+map.get(-j);
                    map.put(j,0);
                    map.put(-j,0);
//                    System.out.println(j+" "+map.get(j));
                }
            }
            else if(j==0){
                if(map.get(j)>1) {
                    count = count + (map.get(j) * (map.get(j)-1));
                    map.put(j, 0);
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int arr[] = {0,0,0,0};
        System.out.println(pairSum(arr,4));
    }
}
