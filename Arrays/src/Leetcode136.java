import java.util.HashMap;

public class Leetcode136 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int ans = 0;
        for (int i:map.keySet()) {
            if(map.get(i)==1) ans=i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
