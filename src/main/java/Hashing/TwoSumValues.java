package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumValues {

    @Test
    public void td1(){
        int[] arr = {2,7,11,15};
        int k=13;
        int[] out = {2,11};
        System.out.println(Arrays.toString(twoSumReturnValues(arr,k)));
        Assert.assertEquals(twoSumReturnValues(arr,k), out);
    }

    public int[] twoSumReturnValues(int[] nums, int k){
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsValue(k-nums[i])){
                output[0] = k-nums[i];
                output[1] = nums[i];
            } else {
                map.put(i,nums[i]);
            }
        }
        return output;
    }
}
