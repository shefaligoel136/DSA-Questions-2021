package Recursion;

public class TowerOfHanoi {

    public static void shifting(int n,char s, char h, char d){
        if(n==1){
            System.out.println("moved "+n+" th disk from "+s+" to "+d);
            return;
        }
        shifting(n-1,s,d,h);
        System.out.println("moved "+n+"th disk from "+s+" to "+d);
        System.out.println("bg "+n);
        shifting(n-1,h,s,d);
    }

    public static void main(String[] args) {
        shifting(3,'s','h','d');
    }
}
