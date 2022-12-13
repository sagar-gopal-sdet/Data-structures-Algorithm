package Sorting;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndices {
    @Test
    public void td1(){
        Assert.assertEquals(findIndicesOfTarget(new int[] {1,2,5,2,3}, 2),new int[] {1,2});
    }

    @Test
    public void td2(){
        Assert.assertEquals(findIndicesOfTargetOptimised(new int[] {1,2,5,2,3}, 2),Arrays.asList(new int[] {1,2}));
    }

    public int[] findIndicesOfTarget(int[] nums, int target){
        List<Integer> al = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) al.add(i);
        }
        int[] op = new int[al.size()];
        for(int i=0;i<al.size();i++){
            op[i] = al.get(i);
        }
        return op;
    }

    public List<Integer> findIndicesOfTargetOptimised(int[] nums, int target){
        List<Integer> al = new ArrayList<>();
        int smaller = 0, same = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) smaller++;
            else if (nums[i]==target) same++;
        }
        for(int i=0;i<same;i++){
            al.add(i+smaller);
        }
        return al;
    }
}
