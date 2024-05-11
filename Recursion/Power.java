public class Power {
    
    public static int pow(int x,int y){
        if (y==0) {
            return 1;
        }
        return x*pow(x, y-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(5, 5));
    }
}
