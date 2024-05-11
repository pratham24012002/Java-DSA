public class LargestArray {
    public static void getLargest(int arr[]){
        int largestValue=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largestValue){
                largestValue=arr[i];
            }
        }
        System.out.println("the largest vlaue of array is "+ largestValue);
    }
    //to print smallest number
    public static void getSmallest(int arr[]){
        int smallestValue=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallestValue){
                smallestValue=arr[i];
            }
        }
        System.out.println("the smllest vlaue of array is "+ smallestValue);
    }
    public static void main(String[] args) {
        int arr[]={25,10,1,5,6};
        getLargest(arr);
        getSmallest(arr);

    }
}
