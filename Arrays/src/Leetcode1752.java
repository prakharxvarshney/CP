public class Leetcode1752 {
    public static boolean check(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<nums[i-1]) {
                count++;
            }
        }
        if(nums[nums.length-1]>nums[0]) {
            count++;
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(check(nums));

    }
}
