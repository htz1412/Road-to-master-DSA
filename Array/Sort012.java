/*
 * Problem Link : https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381875
 */
public class Sort012 {
  public static void sort012(int[] arr) {
    // Write your code here
    int low = 0, mid = 0, high = arr.length - 1;

    while (mid <= high) {
      if (arr[mid] == 0) {
        swapInArray(arr, low, mid);
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        swapInArray(arr, mid, high);
        high--;
      }
    }
  }

  public static void swapInArray(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
