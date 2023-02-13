package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMinimum {

    @Test
    public void td1(){
        Assert.assertEquals(findMinimumValueFromRotatedArray(new int[] {4,5,1,2,3}),1);
    }

    public void td2(){
        Assert.assertEquals(findMinimumValueFromRotatedArray(new int[] {1,2,3,4,5}),1);
    }


}
