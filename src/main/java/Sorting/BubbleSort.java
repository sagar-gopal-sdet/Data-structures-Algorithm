package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BubbleSort {
    @Test
    public void td1(){
        Assert.assertEquals(bubbleSortArray(new int[] {1,5,4,6,7,3,8}), new int[] {1,3,4,5,6,7,8});
    }

    @Test
    public void td2(){
        Assert.assertEquals(bubbleSortArray(new int[] {1,9,10,-2,21,0,-809}), new int[] {-809,-2,0,1,9,10,21});
    }

    public int[] bubbleSortArray(int[] nums){
        int i=0,j=nums.length-1;
        while(j>0){
            i=0;
            while(i<j){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
                i++;
            }
            j--;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
