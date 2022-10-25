package com.week3.slidingwindow;

public class findMinimumLength {
    public int findLength(int[] nums, int target){
        int minimumLength = Integer.MAX_VALUE, sum = 0, tempLength=Integer.MAX_VALUE, index=0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
            while(sum >= target){
                tempLength = i-index+1;
                sum -= nums[index];
                index++;
            }
            minimumLength = Math.min(tempLength,minimumLength);

        }

        return minimumLength == Integer.MAX_VALUE ? 0:minimumLength;
    }
}
