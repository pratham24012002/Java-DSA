public class PalindromeString {
    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i)==str.charAt(str.length()-1-i)) {
                    return true;
                } 
        }
        return false;
    }
    public static void main(String[] args) {
        //palindrome("racecar");
        if(palindrome("raceca")){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
