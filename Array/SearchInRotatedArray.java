public class SearchInRotatedArray {
  public static int search(int arr[], int key) {
    // Write your code here.
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == key) {
        return mid;

      } else if (arr[low] <= arr[mid]) {
        if (arr[low] <= key && key <= arr[mid]) {
          high = mid - 1; // left
        } else {
          low = mid + 1; // right
        }
      } else {
        if (arr[mid] <= key && key <= arr[high]) {
          low = mid + 1; // right
        } else {
          high = mid - 1; // left
        }
      }
    }

    return -1;
  }
}