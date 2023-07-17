public class MaximumSubarraySum {
	public static long maxSubarraySum(int[] arr, int n) {
		long sum = Long.MIN_VALUE;
		long currentSum = 0;

		for (int ele : arr) {
			currentSum += ele;

			if (currentSum > sum) {
				sum = currentSum;
			}

			if (currentSum < 0) {
				currentSum = 0;
			}
		}

		return sum < 0 ? 0 : sum;
	}
}
