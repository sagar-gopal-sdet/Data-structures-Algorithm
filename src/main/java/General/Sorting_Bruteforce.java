package General;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Sorting_Bruteforce {

    @Test
    public void testData1(){
        int[] arr = {2,1,3,0,2,4,1,5,7,6};
        System.out.println(Arrays.toString(sortBruteforce(arr)));
    }

    public int[] sortBruteforce(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
