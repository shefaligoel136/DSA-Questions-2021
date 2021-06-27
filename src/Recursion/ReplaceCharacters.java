package Recursion;

public class ReplaceCharacters {
    public static String replace(String s,char c1, char c2){
        if(s.length()==0)
            return s;

        String smallOutput = replace(s.substring(1),c1,c2);
        if(s.charAt(0) == c1){
            return c2 + smallOutput;
        }else{
            return s.charAt(0)+smallOutput;
        }
    }
    public static void main(String[] args) {
        System.out.println(replace("abcxdxexfx",'x','y'));
    }
}
