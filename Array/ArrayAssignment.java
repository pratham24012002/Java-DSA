public class ArrayAssignment {

    // public static void sumArray(int arr[][]){  //O(n^2)
    //     int sum = 0;
    //     for (int i = 1; i < arr.length-1; i++) {
    //         for (int j = 0; j < arr.length; j++) {
    //             sum +=arr[i][j];
    //         }
    //     }
    //     System.out.println("The sum of elements in the second row is: " + sum);
    // }

    
    public static void sumArr(int arr[][]){  //O(n)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int j=1;
                sum +=arr[j][i];
        }
        System.out.println("The sum of elements in the second row is: " + sum);
    }

    //print the number of times the key is present

    public static void numberTimes(int arr[][],int key){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==key) {
                    count++;
                }
            }
        }
        System.out.println("the numbers of key is "+ count);
    }

    public static void transposeMatrix(int arr[][]){
        System.out.println("original array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int row=2,col=3;
        System.out.println("Transpose Matrix ");
        int transpose[][]=new int[col][row];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i]=arr[i][j];
            }
        }

      printArray(transpose);
    }

    public static void printArray(int transpose[][]){
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        //int key=7;
       // sumArr(arr);
       // numberTimes(arr,key );
       transposeMatrix(arr);
    }
}
