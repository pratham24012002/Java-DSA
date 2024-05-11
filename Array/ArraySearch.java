import java.util.Scanner;

public class ArraySearch {
    
    public static void ArrayInital(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void Array_Input_Output(int arr[]){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }

    //Linear Search

    public static int ArrayLS(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return i;
            }
        }
        return -1;
    } 

    //binary search

    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
       
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int key=5;
        int arr[]={1,2,3,4,5};
        //ArrayInital(arr);
        //Array_Input_Output(arr1);
        int index=ArrayLS(arr,key);
        if (index==-1) {
            System.out.println("key not found");
        }
        else{
            System.out.println("key found");
        }
        System.out.println("the key is present at "+binarySearch(arr,key));
    }
}
