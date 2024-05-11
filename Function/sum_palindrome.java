/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class sum_palindrome
{
    
    //BINARY TO DECIMAL
    
    public static void palindrome(int n){
        int pali=n;
        int rev=0;
        
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(pali==rev){
             System.out.println("number is plaindrome");
        }
        else{
            System.out.println("system is not palindrome");
        }
       
        
    }
    
    //compute of average three number
    
    public static void average_of_three_number(int a,int b,int c){
        int sum=(a+b+c)/3;
        System.out.println("the average of digit is "+sum);
    }
    
    //sum of digit
    
    public static void sum_of_digit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("the sum of digit is "+sum);
    }
    
	public static void main(String[] args) {
		//palindrome(121);
		//average_of_three_number(585,65984,265265);
		sum_of_digit(4);
	}
}
