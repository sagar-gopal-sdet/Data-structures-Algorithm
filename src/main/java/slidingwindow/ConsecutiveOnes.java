package slidingwindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConsecutiveOnes {

    @Test
    public void testData1(){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        Assert.assertEquals(longestOnesBruteforce(arr, 2), 6);
    }

    @Test
    public void testData2(){
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        Assert.assertEquals(longestOnesBruteforce(arr, 3), 10);
    }



    /*Bruteforce-Pseudocode
    * Initialise count var to store the Ones count.
    * Initialise counter var with k value.
    * Iterate the array using for loop with range 0 to array length
    * Initialise new integer tempCount as 0.
    * If ith element is 1, increment the tempCount.
    * Else, if counter > 0, increment the tempCount and decrement the counter.
    * Initialise another for loop inside with range i+1 to array length.
    * If jth element is 1, increment the tempCount.
    * Else, if counter > 0, increment the tempCount and decrement the counter.
    * If counter is 0, break the loop.
    * Within the outside for loop, compare tempCount and count. Store the max value in count.
    * Return count*/

    public int longestOnesBruteforce(int[] nums, int k){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int tempCount = 0, counter = k;
            if(nums[i]==1){
                tempCount++;
            } else {
                if(counter != 0){
                    counter--;
                    tempCount++;
                } else{
                    break;
                }
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==1){
                    tempCount++;
                } else {
                    if(counter != 0){
                        counter--;
                        tempCount++;
                    } else{
                        break;
                    }
                }
            }
            count = Integer.max(count, tempCount);
        }
        return count;
    }
}
