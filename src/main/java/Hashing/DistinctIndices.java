package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class DistinctIndices {
    @Test
    public void td1(){
        Assert.assertEquals(findDistinctIndicesOptimised(new int[] {1,2,3,1},3),true);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findDistinctIndicesOptimised(new int[] {1,0,1,1},1),true);
    }

    @Test
    public void td3(){
        Assert.assertEquals(findDistinctIndicesOptimised(new int[] {1,2,3,1,2,3},2),false);
    }

    /*
    * Pesudocode- Bruteforce
    * Initiate a for loop with range i=0 to array length-1
    * Intialise an inner for loop with range j=0 to array length
    * Verify if j-i is lesser than or equal to k and ith element and jth element are same.
    * If condition satsified, return true.*/

    public boolean findDistinctIndicesBruteforce(int[] nums, int k){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j-i<=k && nums[i]==nums[j]){
                    return true;
                }

            }
        }
        return false;
    }

    /*Pesudocode- Hashmap
    * If k value is 0, return false.
    * Initialise Hashmap with Key and Value as Integers.
    * Iterate the array nums using for loop with range 0 to array length.
    * Verify if map alredy contains nums[i] and i-current map value is less than or equal to k.
    * Return true if bove condition is satisfied.
    * Else add the new entryset to map. */

    public boolean findDistinctIndicesOptimised(int[] nums, int k){
        if(k==0) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                return true;
            } else map.put(nums[i],i);
        }

        return false;

    }
}
