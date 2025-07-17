import java.util.*;

public class RotateArrayScheduler {

    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        revers(nums, 0, nums.length-1);
        revers(nums, 0, k-1);
        revers(nums, k, nums.length-1);
    }
    public static void revers(int[] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            rotate(arr, k);
            for (int val : arr) System.out.print(val + " ");
            System.out.println();
            System.out.println();
        }
        sc.close();
    }
}
