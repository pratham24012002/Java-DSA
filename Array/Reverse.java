public class Reverse {
    public static void ReverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        
    }
    public static void main(String[] args) {
      int arr[]={10,9,8,7,6,5};
      ReverseArray(arr); 
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      } 
    }
}