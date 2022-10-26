package twoPointer;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumberBruteForce(int[] nums){
        int k=0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                k=i;
                break;
            }
        }
        if(k==0){

        }
        return k;
    }

    public int missingNumber(int[] nums){
        int sum=0;
        int l = nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int actualSum = (l*(l+1))/2;
        return actualSum-sum;
    }


    @Test
    public void testData1(){
        int[] arr = {0};
        int k=missingNumberBruteForce(arr);
        System.out.println(k);
    }
}
