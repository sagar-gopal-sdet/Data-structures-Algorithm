package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmaticTriplets {
    @Test
    public void td1(){
        Assert.assertEquals(findTripletesCount(new int[] {0,1,4,6,7,10}, 3), 2);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findTripletesCount(new int[] {4,5,6,7,8,9}, 2), 2);
    }

    public int findTripletesCount(int[] nums, int diff){
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[j]-nums[i] == diff && nums[k]-nums[j]==diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int findTripletesCountOptimised(int[] nums, int diff){
        int count=0,i=0,j=2;
        if(nums.length<3) return 0;
        while(j<nums.length){
            if(nums[i+1]-nums[i] == diff && nums[j]-nums[i+1]==diff){
                count++;
                i++;
                j++;
            }
        }

        return count;
    }
}
