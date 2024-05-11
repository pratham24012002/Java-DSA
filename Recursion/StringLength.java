public class StringLength {

    public static void lengthCount(String str,int count){
        if (str=="") {
            return;
        }
        lengthCount();
    }
    public static void main(String[] args) {
        String str="Pratham";
        int count=0;
        lengthCount(str,count);
    }
}
