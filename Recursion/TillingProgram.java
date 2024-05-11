public class TillingProgram {
    
    public static int tillingProblem(int n){
        if (n==0 || n==1) {
            return 1;
        }
        //choice

        //vertical choice
        int fnm1 = tillingProblem(n-1);

        //horizontal choice
        int fnm2 = tillingProblem(n-2);

        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(3));
    }
}
