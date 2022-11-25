package TwoPointers;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    @Test
    public void td1(){
        Assert.assertEquals(toRemoveDuplicates(new int[] {1,1,2}), 2);
    }

    @Test
    public void td2(){
        Assert.assertEquals(toRemoveDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}), 5);
    }

    public int toRemoveDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        int j=0;
        int[] arr = new int[set.size()];
        for(int i : set){
            arr[j]=i;
            j++;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            nums[i] = arr[i];
        }

        return set.size();
    }

    public int toRemoveDuplicatesOptimised(int[] nums){
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]) nums[k++]=nums[i];
        }
        return k;
    }
}
