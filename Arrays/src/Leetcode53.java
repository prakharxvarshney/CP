public class Leetcode53 {
    public static int maxSubArray(int[] nums) {
        int min=Integer.MIN_VALUE;
        int max=0;
        for (int num : nums) {
            max += num;
            if (min < max) min = max;
            if (max < 0) max = 0;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
}
