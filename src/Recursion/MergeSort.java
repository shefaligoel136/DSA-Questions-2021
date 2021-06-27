package Recursion;

public class MergeSort {

    public static void merge(int a[], int b[], int arr[]){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j< b.length){
            if(a[i] <= b[j]){
                arr[k] = a[i];
                System.out.print("arr by a "+ arr[k]);
                k++;
                i++;
            }else{
                arr[k] = b[j];
                System.out.print("arr by b "+ arr[k]);
                k++;
                j++;
            }
            System.out.println();
        }
        while(i<a.length){
            arr[k] =a[i];
            k++;
            i++;
        }
        while(j<b.length){
            arr[k] = b[j];
            k++;
            j++;
        }
    }

    public static void mergeSort(int arr[]){
        if(arr.length<=1){
            return;
        }
        int a[] = new int[arr.length/2];
        int b[] = new int[arr.length - a.length];

        System.out.println("a");
        for(int i = 0; i<arr.length/2 ; i++){
            a[i] = arr[i];
            System.out.print(a[i]);
        }

        System.out.println();
        System.out.println("b");
        for(int i = arr.length/2;i< arr.length;i++){
            b[i - arr.length/2] = arr[i];
            System.out.print(b[i - arr.length/2]);
        }
        System.out.println("Sending merge a");
        mergeSort(a);
        System.out.println("Sending merge b");
        mergeSort(b);
        System.out.println(" Sending merge to function ");
        merge(a,b,arr);
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,6,2,6,1,8};
        mergeSort(arr);
        System.out.println("final sort");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
