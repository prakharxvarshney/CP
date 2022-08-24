import java.util.Arrays;

public class Leetcode283 {
    public static void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {2,1};
        moveZeroes(nums);
    }
}
