package SlidingWindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxSubArrayProduct {
    @Test
    public void testData1() {
        int[] arr = {2, 3, -2, 4};
        Assert.assertEquals(maxProduct(arr), 6);
    }

    @Test
    public void testData2() {
        int[] arr = {};
        Assert.assertEquals(maxProduct(arr), 0);
    }

    @Test
    public void testData3() {
        int[] arr = {2};
        Assert.assertEquals(maxProduct(arr), 2);
    }

    @Test
    public void testData4() {
        int[] arr = {-2};
        Assert.assertEquals(maxProduct(arr), -2);
    }


    @Test
    public void testData5() {
        int[] arr = {-2, 0, -1};
        Assert.assertEquals(maxProduct(arr), 0);
    }

    @Test
    public void testData6() {
        int[] arr = {-2, -1, 10};
        Assert.assertEquals(maxProduct(arr), 20);
    }

    @Test
    public void testData7() {
        int[] arr = {-2, -1, -10, -10};
        Assert.assertEquals(maxProduct(arr), 200);
    }

    @Test
    public void testData8() {
        int[] arr = {3, -1, 4};
        Assert.assertEquals(maxProduct(arr), 4);
    }

    @Test
    public void testData9() {
        int[] arr = {0, 2};
        Assert.assertEquals(maxProduct(arr), 2);
    }

    @Test
    public void testData10() {
        int[] arr = {-5, 0, 2};
        Assert.assertEquals(maxProduct(arr), 2);
    }


    public int maxProductBruteforce(int[] nums) {
        /*Pseudocode
         * Initialise product variable as Minimum integer value.
         * Start a for loop with range i = 0 to array length -2
         * Initialise tempProduct var and assign it with arr[i].
         * Start an inner loop with range j = i+1 to array length-1
         * Append tempProduct with jth element
         * Compare product and tempProduct, assign product with max value.
         * close both the loops.
         * Return product
         * */
        int product = Integer.MIN_VALUE;
        if (nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];
        else {
            for (int i = 0; i < nums.length; i++) {
                product = Integer.max(product, nums[i]);
                int temp = nums[i];
                if (temp == 0) temp = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    temp *= nums[j];
                    product = Integer.max(temp, product);
                }
            }
        }


        return product;
    }


    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];
        else {

            int product = nums[0];
            int temp = nums[0];
            if (temp == 0) temp = 1;

            for (int j = 1; j < nums.length; j++) {
                product = Integer.max(product, nums[j]);
                if (temp == 0) temp = 1;
                temp *= nums[j];

                product = Integer.max(product, temp);


            }

            temp = nums[nums.length - 1];

            for (int i = nums.length - 2; i > 0; i--) {
                product = Integer.max(product, nums[i]);
                if (temp == 0) temp = 1;
                temp *= nums[i];

                product = Integer.max(product, temp);

            }

            return product;

        }

    }
}
