public class DiagonalSum {

    public static void diagnolSum(int matrix[][]){ 
        int sum=0;
        //primary diagnol
        // for (int i = 0; i < matrix.length; i++) { //O(n^2)
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i==j) {
        //             sum+=matrix[i][j];
        //         }
        //         //secondary diagonal
        //         else if (i+j==matrix.length-1) {
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println("diagonal sum is "+ sum);


        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i]; //primary diagonal 
            if (i!=matrix.length-1-i) { //secondary Diagonal
                sum+=matrix[i][matrix.length-1-i];
            }
        }

        System.out.println("diagonal sum is "+ sum);
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}
                    };

        diagnolSum(matrix);
    }
}
