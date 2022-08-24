import java.util.Arrays;

public class Leetcode189 {
    public static void rotate(int[] nums, int k) {
        int[] num = new int[nums.length];
        System.arraycopy(nums, 0, num, 0, nums.length);
        for(int i=0;i<nums.length;i++) {
            int n = (i+k)%nums.length;
            nums[n] = num[i];
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
}
