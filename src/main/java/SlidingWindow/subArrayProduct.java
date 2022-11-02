package SlidingWindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class subArrayProduct {

    @Test
    public void testData1(){
        int[] nums = {10,5,2,6};
        int k=100;
        Assert.assertEquals(numSubarrayProductLessThanK(nums,k),8);
    }

    @Test
    public void testData2(){
        int[] nums = {10,5,2,6};
        int k=0;
        Assert.assertEquals(numSubarrayProductLessThanK(nums,k),0);
    }

    @Test
    public void testData3(){
        int[] nums = {};
        int k=100;
        Assert.assertEquals(numSubarrayProductLessThanK(nums,k),0);
    }

    @Test
    public void testData4(){
        int[] nums = {0,0,0};
        int k=2;
        Assert.assertEquals(numSubarrayProductLessThanK(nums,k),0);
    }

    /*Pseudocode-
    * Initialise product variable =1, count =0.
    * Iterate the array over a for loop with i range 0 to array length.
    * If the ith element is < k, increment count.
    * Start another for loop inside with j range i+1 to array length.
    * Find the product of ith element and jth element of the array and append it to product variable,
    * If product is less than k, increment count.
    * else break.
    * After both the loops ends, return count.
    * */

    public int subArrayProductBruteforce(int[]nums, int k){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int product = 1;
            product*=nums[i];
            if(product<k) count++;
            for(int j=i+1;j<nums.length;j++){
                product *= nums[j];
                if(product<k) count++;
                else break;

            }
        }

        return count;
    }

    public int numSubarrayProductLessThanK(int[] nums, int k){
        if (k == 0) return 0;
        int count = 0;
        int product = 1;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            product *= nums[j];
            while (i <= j && product >= k) {
                product /= nums[i++];
            }
            count += j - i + 1;
        }
        return count;
    }
}
