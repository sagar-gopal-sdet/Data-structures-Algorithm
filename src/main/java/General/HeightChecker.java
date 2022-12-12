package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class HeightChecker {
    @Test
    public void td1(){
        Assert.assertEquals(checkHeight(new int[] {1,1,4,2,1,3}), 3);
    }

    public int checkHeight(int[] heights){
        int[] arr = heights.clone();
        int sum = 0;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]) sum+=1;
        }
        return sum;
    }
}
