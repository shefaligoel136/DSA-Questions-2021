package AlgoBased;

import java.util.Scanner;

public class stockSpanProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of days");
        int days = sc.nextInt();
        int price[] = new int[days];
        for(int i=0;i<days;i++){
            price[i] = sc.nextInt();
        }
        int maxProfit = calProfit(price);
        System.out.println("Max profit: " + " " + maxProfit);
    }

    public static int calProfit(int price[]){
        int max = 0,min = price[0];
        for(int i=1;i<price.length;i++){
            if(price[i]<=min){
                min = price[i];
            }else if(price[i]>=max){
                max = price[i];
            }
        }
        if(max == 0){
            return -1;
        }
        return  max-min;
    }
}
