package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class DuplicateZeroes {

    @Test
    public void td1(){
        duplicateZeroes(new int[] {1,0,2,3,0,4,5,0});
    }

    /*Pseudocode
    * Intialise output array with same length of input array
    * Initialise j=0
    * Iterate through the input array for range 0 to input array length
    * Assign jth element of output array as ith element of input array.
    * Increment j.
    * If ith element is 0, then increment j once again.
    * If j is equal to input array length after the increment, then break the loop.
    * Assign the values of output array to the input array.
    * */

    public void duplicateZeroes(int[] nums){
        int[] op = new int[nums.length] ;
        for(int i=0,j=0;i<nums.length && j<nums.length;i++){
            op[j]= nums[i];
            if(nums[i]!=0) j++;
            else j=j+2;
            if(j==nums.length) break;
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = op[i];
        }
    }
}
