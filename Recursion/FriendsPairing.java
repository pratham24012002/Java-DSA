public class FriendsPairing {

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        
        // Single choice
        int fnm1 = friendsPairing(n - 1);

        // Pair choices
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;
        
        //total ways
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        int result = friendsPairing(3);
        System.out.println("Total number of ways: " + result);
    }
}
