package com.week3.slidingwindow;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MinimumDifference {
    public int findMinimumDifference(int[] nums, int k){
        int minimum = Integer.MAX_VALUE;
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        for(int i= nums.length-1;i>=0;i--){
            int temp = nums[i]-nums[i-1];
            minimum = Math.min(minimum, temp);
        }


        return minimum;
    }
}
