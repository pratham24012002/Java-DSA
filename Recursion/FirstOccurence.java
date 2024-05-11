public class FirstOccurence {

    public static int firstOccur(int arr[],int key,int i){
        
        if (i==arr.length) {
            return -1;
        }

        if (arr[i]==key) {
            return i;
        }

        return firstOccur(arr,key,i+1);
    }

    public static int lastOccur(int arr[],int key,int i){
        if (i==-1) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }

        return lastOccur(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,6,5,5,10};
        int length=arr.length-1;
        //System.out.println(firstOccur(arr,5,0));
        System.out.println(lastOccur(arr,6,length));
    }
}
