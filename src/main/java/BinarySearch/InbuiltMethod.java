package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class InbuiltMethod {
    @Test
    public void td1(){
        Assert.assertEquals(findPosition(new int[] {1,3,5,7},6),3);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findPosition(new int[] {1,3,5,6},7),4);
    }

    @Test
    public void td3(){
        Assert.assertEquals(findPosition(new int[] {1,3,5,6},0),0);
    }

    public int findPosition(int[] nums, int target){
        int index=Arrays.binarySearch(nums,target);
        if(index<0) index = (index*-1)-1;
        return index;
    }
}
