import java.util.*;

public class SumOfInfiniteArray {
  public static void main(String[] args) {
    int[] arr = new int[] { 13288, 59470, 76228, 76097, 7207, 23723, 90900, 92571, 84929, 69554, 64330, 98202, 23297,
        8406, 22442, 10585, 78245, 72156, 21483, 27979, 32061, 27487, 83545, 5010, 61999, 1006, 23924, 17384, 54646,
        36076, 49968, 86073, 54335, 66160, 22932, 58311, 47498, 35107, 29403, 4165, 96879, 34756, 19605, 12733, 58198,
        38279, 16839, 31882, 22430, 32145, 47943, 82526, 55159, 15678, 99873, 27582, 3368, 97596, 61045, 95649, 70665,
        73389, 44566, 53364, 67626, 4329, 51948, 71992, 82539, 67866, 87443, 42083, 77410, 29821, 99002, 26139, 83992,
        53320, 38981, 74142, 32844, 66974, 80556, 96253, 92110, 69949, 68057, 41276, 55781, 72945, 48974, 39796, 58154,
        81502, 73149, 34290, 77387, 81466, 27054, 15317, 23401, 7599, 75132 };

    List<List<Long>> queries = new ArrayList<>() {
      {
        add(new ArrayList<>() {
          {
            add(6503l);
            add(7858l);
          }
        });
        add(new ArrayList<>() {
          {
            add(3905l);
            add(67142l);
          }
        });
        add(new ArrayList<>() {
          {
            add(3386l);
            add(41788l);
          }
        });
        add(new ArrayList<>() {
          {
            add(1652l);
            add(34587l);
          }
        });
        add(new ArrayList<>() {
          {
            add(6647l);
            add(77134l);
          }
        });
        add(new ArrayList<>() {
          {
            add(8484l);
            add(92830l);
          }
        });
        add(new ArrayList<>() {
          {
            add(474l);
            add(11991l);
          }
        });
        add(new ArrayList<>() {
          {
            add(9271l);
            add(12257l);
          }
        });
        add(new ArrayList<>() {
          {
            add(2880l);
            add(93275l);
          }
        });
        add(new ArrayList<>() {
          {
            add(9541l);
            add(17578l);
          }
        });
      }
    };

    List<Integer> result = sumInRanges(arr, arr.length, queries, queries.size());
    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i));
    }
  }

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
