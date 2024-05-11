import java.util.*;
public class DistinctElement {
    public static boolean distinctArray(int arr[],int n){
        for (int i = 0; i <n-1; i++) {
            if (arr[i]==arr[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(distinctArray(arr,n));
    }
}
