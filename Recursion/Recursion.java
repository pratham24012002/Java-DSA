class Recursion{
    //factorial function
    public static  int fact(int n){
        if ( n==0) {
            return 1;
        }
        return (n * fact(n-1));
    }

    //print number in decreasing order

    public static void printDec(int n){
        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }

    //sum of all digits
    public static int sum(int n){
        if (n==1) {
            return 1;
        }
        return n+sum(n-1);
    }

    //fibonacci Numbers

    public static int fibonacci(int n){
        if (n==0 || n==1) {
            return n;
        }
        
        return (fibonacci(n-1)+fibonacci(n-2));
         
    }

    //check  array is sorted or not
    
    public static boolean isSorted(int arr[],int i) {
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        //System.out.println(fact(5));
        //printDec(5);
        //System.out.println(sum(5));
        //System.out.println(fibonacci(6));

        int arr[]={1,3,2,4,5};
       System.out.println(isSorted(arr,0));
    }
}