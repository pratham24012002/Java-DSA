public class patterns {
    public static void hollow_pattern(int lastrow,int lastcol){
        for(int i=1;i<=lastrow;i++){
            for(int j=1;j<=lastcol;j++){
                if(i==1 || i==lastrow || j==1 || j==lastcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void inverted_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            //print the space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print the star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_pyramid_number_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyd_triangle_pattern(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void butterfly_pattern(int n){
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print the space
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            //print the star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print thr space
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            //print the star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rohmbus(int n){
        for (int i = 1; i <=n; i++) {
            //print the space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //print the star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void number_pyramid_pattern(int n){
        for (int i = 1; i <= n; i++) {
            //print the space
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //print the number
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus_patter(int lastrow,int lastcol){
        for (int i = 1; i <= lastrow; i++) {
            //print the space
            for (int j = 1; j <= lastrow-i; j++) {
                System.out.print(" ");
            }
            //print the pattern
            for (int j = 1; j<=lastcol; j++) {
                if(i==1 || i==lastrow ||j==1 || j==lastcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void palindrome_patter_with_number(int n){
        //int counter=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
               System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //hollow_pattern(4,5 );
        //inverted_half_pyramid(4);
        //inverted_pyramid_number_pattern(5);
        //floyd_triangle_pattern(5);
        //butterfly_pattern(4);
        //solid_rohmbus(5);
       // number_pyramid_pattern(4);
       //hollow_rhombus_patter(5, 5);
       palindrome_patter_with_number(5);
    }
}
