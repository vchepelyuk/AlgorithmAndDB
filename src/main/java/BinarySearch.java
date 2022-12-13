public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(bSearch(new int[] {1,5,7,8,9,12,14,17,20,33}, 17));
    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length -1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < a[middle]) {
                high = middle -1;
            }
            else if (key > a[middle]) {
                low = middle +1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    public static int bSearch(int[] a, int b) {
        int low = 0;
        int high = a.length -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (b < a[mid]) {
                high = mid -1;
            }
            else if (b > a[mid]) {
                low = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
