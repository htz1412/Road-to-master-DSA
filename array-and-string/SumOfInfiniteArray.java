import java.util.*;

public class SumOfInfiniteArray {
  public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
    List<Integer> result = new ArrayList<>();
    int sumLimit = (int) Math.pow(10, 9) + 7;
    Long sum = 0l;

    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }

    for (int i = 0; i < q; i++) {
      Long aggregatedSum = sum;
      Long lower = queries.get(i).get(0);
      Long upper = queries.get(i).get(1);

      Long noOfElementsToSum = (upper - lower) + 1;
      aggregatedSum = (noOfElementsToSum / n) * aggregatedSum;
      Long k = noOfElementsToSum % n;
      Long startElement = lower % n;
      startElement = ((startElement == 0 ? n : startElement) - 1) % (long) Math.pow(10, 18);

      while (k-- > 0) {
        aggregatedSum += arr[startElement.intValue()];
        startElement = (startElement + 1) % n;
      }

      aggregatedSum %= sumLimit;
      result.add(aggregatedSum.intValue());
    }

    return result;
  }
}
