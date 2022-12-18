package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingDescending {

    @Test
    public void td1(){
        Assert.assertEquals(sortUsingBruteforce(new int[] {1,5,4,6,7,3,8}), new int[] {8,7,6,5,4,3,1});
    }

    @Test
    public void td2(){
        Assert.assertEquals(sortUsingBruteforce(new int[] {1,9,10,-2,21,0,-809}), new int[] {21,10,9,1,0,-2,-809});
    }

    public int[] sortUsingBruteforce(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
