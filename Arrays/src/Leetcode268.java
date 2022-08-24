public class Leetcode268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedTotal = (n*(n+1))/2;
        int total = 0;
        for(int num:nums) {
            total+=num;
        }
        return expectedTotal-total;
    }

    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
}
