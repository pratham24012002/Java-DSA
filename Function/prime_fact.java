public class prime_fact{
    
    public static int fact(int n){
        int fact=1;
        for (int i=1;i<=n;i++ ){
            fact=fact*i;
        } 
        return fact;
    }
    
    static int binoCof(int n,int r){
        int nFact=fact(n);
        int rFact=fact(r);
        int nMR=fact(n-r);
        
         int finalFact=nFact/rFact*nMR;
         return finalFact;
    }
    
    //prime number function
    
    public static boolean prime(int n){
        for (int i=2;i<=n-1 ;i++ ){
            if (n%i==0){
                return false;
            } 
        } 
        return true;
    }
    
    //optimized way to find prime number
    
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;   
            }
        }
        return true;
    }
    
    //range of prime number
    public static void primeRange(int n){
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
           
        }
    }
    
    public static void main(String args[]){
        primeRange(100);
    }
}