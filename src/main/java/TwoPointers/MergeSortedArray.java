package TwoPointers;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortedArray {
    @Test
    public void td1(){
        Assert.assertEquals(mergeArrays(new int[] {1,2,3,0,0,0},3,new int[] {2,5,6},3),new int[] {1,2,2,3,5,6});
    }

    @Test
    public void td2(){
        Assert.assertEquals(mergeArrays(new int[] {1},1,new int[] {},0), new int[] {1});
    }

    public int[] mergeArrays(int[] nums1, int m, int[] nums2, int n){
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
