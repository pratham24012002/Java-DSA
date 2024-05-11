public class Subarray {
    
    public static int sum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

        public static void SubarrayPairs(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                //System.out.print(arr[i]);
                int start=i;
                for (int j = i; j < arr.length; j++) {
                    //System.out.print("("+arr[i]+","+arr[j]+")");
                    int end=j;
                    for (int k = start;k<= end; k++) {
                        System.out.print(arr[k]+" ");
                        System.out.println("the sum of the subarray: " + sum(arr, i, j));
                    }
                    System.out.println();
                }
                System.out.println();
               
            }
        }
        public static void main(String[] args) {
            int arr[]={2,4,6,8,10};
            SubarrayPairs(arr);
        }
    
}
