/**
 * bin_dec
 */
public class bin_dec {

    //bin to decimal

    public static void binToDec(int n){
        int myNm=n;
        int pow=0;
        int dec=0;
        while (n>0) {
            int rem=n%10;
            dec=dec+(int)(rem*(Math.pow(2, pow)));
            pow++;
            n=n/10;
        }
        System.out.println("decimal number of " + myNm +" is "+dec);
    }

    //decimal to binary

    public static void decToBin(int n){
        int myNm=n;
        int pow=0;
        int bin=0;
        while (n>0) {
            int rem=n%2;
            bin=bin+(int)(rem*Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary number of "+myNm+"is = "+bin);
    }

    public static void main(String[] args) {
        binToDec(1010);
        decToBin(5);
    }
    
}
