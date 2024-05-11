import java.util.*;

public class SortingMethod{
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //selection sort

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos= j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    //insertion Sort

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct postion to insert
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1]=curr;
        }
    }

    //counting sort
    //it is mainly use for positive and small range of number
    
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest,arr[i]);
        }

        int countArr[]=new int[largest+1];

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        int j=0;
        for (int i = 0; i < countArr.length; i++) {
            while(countArr[i]>0){
                arr[j]=i;
                j++;
                countArr[i]--;
            }
        }
    }


    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //printArray(arr);

        //inbuilt sort method

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}