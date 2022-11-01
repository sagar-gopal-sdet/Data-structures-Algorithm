package General;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSumHashmap(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] output = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k-nums[i])){
                output[0] = map.get(k-nums[i]);
                output[1] = i;
            } else {
                map.put(nums[i],i);
            }

        }

        return output;
    }
}
