package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeIntervals {
    @Test
    public void td1(){
        Assert.assertEquals(mergeIntervals(new int[][] {{1,3},{2,6},{8,10},{15,18}}),new int[][] {{1,6},{8,10},{15,18}});
    }

    public int[][] mergeIntervals(int[][] intervals){

        return intervals;
    }
}
