package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindInsertPosition {
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

    /*Pseudocode
    * Initialise left variable as 0, right as array length-1 and declare mid
    * Initiate a while with condition until left<=right
    * Assign mid value as sum of left and right /2
    * If nums[mid]<target,
        * verify if mid is not the last index and next element to mid is greater than target. If yes return mid+1
        * Else if mid is the last element and current mid element is still less than target, return mid +1
        * Else assign left as mid+1
    * Else if nums[mid]>target,
        * verify if mid is not first index and previous element to mid is lesser than target. If yes return mid
        * Else if mid is the first element and current mid element is still greater than target, return 0
        * Else assign right as mid+1
    * Else return mid*/



    public int findPosition(int[] nums, int target){

        int left = 0, right=nums.length-1, mid;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]<target){
                if(mid!=nums.length-1 && nums[mid+1]>target) return mid+1;
                else if(mid==nums.length-1 && nums[mid]<target) return mid+1;
                else left=mid+1;
            } else if (nums[mid]>target) {
                if(mid!=0 && nums[mid-1]<target) return mid;
                else if(mid==0 && nums[mid]>target) return 0;
                else right=mid-1;
            } else if(nums[mid]==target) return mid;

        }
        return -1;
    }
}
