public class FirstLetterToUppercase {

    public static void firstLetterToUppercase(String str){
        StringBuilder newStr = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        newStr.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i)==' ') && i<str.length()-1) {
                newStr.append(str.charAt(i));
                i++;
                newStr.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
               newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String str="hi i , am pratham jaiswal";
        firstLetterToUppercase(str);
    }
    
}