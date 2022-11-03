package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    @Test
    public void td1(){
        Assert.assertEquals(findMajorityELement(new int[] {3,2,3}), 3);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findMajorityELement(new int[] {2,2,1,1,1,2,2}), 2);
    }


    public int findMajorityELement(int[] nums){
        /*
        * Initialise hash map
        * Iterate over the nums array for range 0 till nums.length
        * Add the ith element as key and no. of occurrence as value.
        * If value of the current element is greater than nums.length/2, return the key*/

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }

    public int findMajorityELementOptimised(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
