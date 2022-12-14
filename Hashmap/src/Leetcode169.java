import java.util.HashMap;

public class Leetcode169 {
    public static int majorityElement(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) {
            if(!map.containsKey(i)) {
                map.put(i,1);
            }
            else {
                map.put(i,map.get(i)+1);
            }
        }
        for (int i: map.keySet()) {

            if(map.get(i)>nums.length/2) {
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
