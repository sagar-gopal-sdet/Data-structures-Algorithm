package General;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondMax {

    @Test
    public void td1(){
        Assert.assertEquals(findSecondMax(new int[] {8,3,5,1,3,9,2,5,7}), 8);
    }

    public int findSecondMax(int[] nums){
        int fMax = 0, sMax = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>fMax) {
                sMax=fMax;
                fMax=nums[i];
            } else if(nums[i]<fMax && nums[i]>sMax) sMax=nums[i];
        }
        return sMax;
    }
}
