package slidingwindow;

import org.testng.annotations.Test;

public class FindAvg {
    public double findMaxAverage(int[] nums, int k){
        double maxAvg = Double.MIN_VALUE, windowAvg = Double.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg = sum/k;

        for(int i=k;i<nums.length;i++){
            sum = sum -nums[i-k]+nums[i];
            windowAvg = sum/k;
            maxAvg = Math.max(windowAvg,maxAvg);
        }
        return maxAvg;
    }

    @Test
    public void testData1(){
        int[] arr = {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(arr,k));
    }
}


