package Sorting;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectionSort {

    @Test
    public void td1(){
        Assert.assertEquals(selectionSortArray(new int[] {1,5,4,6,7,3,8}), new int[] {8,7,6,5,4,3,1});
    }

    @Test
    public void td2(){
        Assert.assertEquals(selectionSortArray(new int[] {1,9,10,-2,21,0,-809}), new int[] {21,10,9,1,0,-2,-809});
    }

    public int[] selectionSortArray(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int lowIndex = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[lowIndex]) lowIndex = j;
            }
            int temp = nums[lowIndex];
            nums[lowIndex] = nums[i];
            nums[i]=temp;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }


}
