package TimeComplexity;

public class rotateArray {
    public static void rotate(int[] arr, int d) {
        //Your code goes here
        arr = reverse(arr,0,arr.length-1);
        arr = reverse(arr,0,arr.length-1-d);
        arr = reverse(arr,arr.length-d,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static int[] reverse(int[] arr,int s,int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,2);
    }
}


