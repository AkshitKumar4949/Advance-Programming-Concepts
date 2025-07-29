class Code {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2 };
        int n = 5;
        int idx = findStart(arr, n);
        System.out.println("Array is rotated at: " + idx);
    }

    private static int findStart(int[] arr, int n) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > arr[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}