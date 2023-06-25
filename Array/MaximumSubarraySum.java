public class MaximumSubarraySum {
	public static void main(String[] args) {
		int[] arr = { -7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10 };
		long result = maxSubarraySum(arr, arr.length);
		System.out.println(result);
	}

	// coding ninjas
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

	// Leetcode
	public int maxSubArray(int[] nums) {
		int sum = Integer.MIN_VALUE;
		int currentSum = 0;

		for (int num : nums) {
			currentSum += num;

			if (currentSum > sum) {
				sum = currentSum;
			}

			if (currentSum < 0) {
				currentSum = 0;
			}
		}

		return sum;
	}
}
