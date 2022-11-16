package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class UniqueSum {

    @Test
    public void td1(){
        Assert.assertEquals(findUniqueSumOptimised(new int[] {1,2,3,4,2}), 8);
    }

    /*Pseudocode
    * Initiate a hashset set and array list lst
    * Initiate a for loop with range 0 to input array length
    * Verify if the ith element is already present in set and not present in list, if condition satisies, then add.
    * Else remove the existing element and add it to the list.
    * After the for loop ends, find the sum of set elements and return*/

    public int findUniqueSum(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
                al.add(nums[i]);
            } else {
                if(!al.contains(nums[i])){
                    set.add(nums[i]);
                }
            }
        }

        return set.stream().mapToInt(Integer::intValue).sum();
    }

    public int findUniqueSumOptimised(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(uniqueCheck(nums[i],nums)) sum+=nums[i];
        }
        return sum;
    }

    public boolean uniqueCheck(int a, int[] arr){
        int count = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==a) count++;
            if(count>1) return false;
        }
        return true;
    }
}
