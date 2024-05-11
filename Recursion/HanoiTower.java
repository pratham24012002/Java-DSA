public class HanoiTower {

    public static void towerOfHanoi(int n,int A,int C,int B){  //Moving disk from A to C through B
        if (n==0) {
            return;
        }
        towerOfHanoi(n-1, A, B, C);
        System.out.println("Moving "+ n + " th disk from " + A + " to " + C);
        towerOfHanoi(n-1, B, C, A);
    }
     public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,1,3,2);
     }
}