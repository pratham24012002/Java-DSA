public class MaxSubbarraySum {
    
    //Max subarray sum using Brut force approach

    public static void maxSubarraySum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currSum=0;
                for (int k = start; k <= end; k++) {
                    currSum=currSum+arr[k];
                }
                System.out.println(currSum);
                if (currSum>maxSum) {
                    maxSum=currSum;
                }   
            }
        }
        System.out.println("the max sum of subaaray is :"+maxSum);
    }

    //max sub array using preffix array
    //time complexity is O(nsquare)

    public static void preffixArray(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int preffix[]=new int[arr.length];
        preffix[0]=arr[0];
        for (int i = 1; i < preffix.length; i++) {
            preffix[i]=preffix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currSum=start==0 ? preffix[end] : preffix[end]-preffix[start-1];
                if (currSum>maxSum) {
                    maxSum=currSum;
                }   
            }
        }
        System.out.println("the max sum of subaaray is :"+maxSum);
    }

    //kaddens algorithm to calculate maxSubarraySum

    public static void kaddensMax(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            if (currSum<0) {
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("the max sum of subarray is :"+maxSum);
       
    }
    public static void kaddensMin(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            if (currSum>maxSum) {
                maxSum=currSum;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("the max sum of subarray is :"+maxSum);
       
    }

    public static void main(String[] args) {
        int numbers[]={-1,-2,-6,-1,-3};
        //maxSubarraySum(numbers);
        //preffixArray(numbers);
        //kaddensMax(numbers);
        kaddensMin(numbers);
    }
}
