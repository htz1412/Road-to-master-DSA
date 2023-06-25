public class FlipBits {
    public static void main(String[] args) {

    }

    // Took 2 hours to solve but couldn't solve it because I had misunderstood the problem statement.
    // Solution from discuss tab [Working]
    public static int flipBits(int[] arr, int n) {
        // Write your code here
        int count1 = 0; // . counts number of 1
        int currsum = 0, maxsum = 0; // finds maximum sum

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count1++;
                arr[i] = -1;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            currsum = Math.max(currsum + arr[i], arr[i]);
            maxsum = Math.max(currsum, maxsum);
        }

        return maxsum + count1;
    }
}
