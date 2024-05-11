import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // char ch[]={'P','r','a','t','h','a','m'};
        //for (int i = 0; i < ch.length; i++) {
        //    System.out.println(ch[i]);
        //}
        //String str1="abcd";
        //String str2="abcd";

        //String str1=new String("123");
        //String str2=new String("123");
        //String st1;

       // st1=sc.nextLine();
        //System.out.println(st1);
        //System.out.println(str1==str2);//false it will check address
       // System.out.println(str1.equals(str2));//true //it will check value

        String firstName="Pratham";
        String lastName="Jaiswal";
        //System.out.println(firstName+" "+lastName);//concatenate

        //System.out.println(firstName.charAt(0));//to get a value at particulat index

        //Substrings

        String fullName="Pratham Jaiswal";

        System.out.println(fullName.substring(0,7));
    }    
}
