package TwoPointers;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSum {

    public int[] sortedTwoSum(int[] nums, int target){
        int[] arr1 = new int[2];
        int i = 0, j=nums.length-1;
        while(i<j){
            int temp = nums[i]+nums[j];
            if(temp>target){
                j--;
            } else if(temp==target){
                arr1[0]=i;
                arr1[1]=j;
                break;
            } else {
                i++;
            }
        }
        return arr1;
    }

    @Test
    public void testData1(){
        int[] arr = {1,5,4,2,6,6,8,7,5};
        int target = 11;
        int arr1[] = sortedTwoSum(arr,target);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void testData2(){
        int[] arr = {2,7,5,11};
        int target = 13;
        int[] arr1 = sortedTwoSum(arr,target);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void testData3(){
        int[] arr = {3,3};
        int target = 6;
        int[] arr1 = sortedTwoSum(arr,target);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void testData4(){
        int[] arr = {0,0,4,5,10,11,20};
        int target = 0;
        int[] arr1 = sortedTwoSum(arr,target);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void testData5(){
        int[] arr = {-10,-5,-6,2,6,6,8,7,5};
        int target = -11;
        int[] arr1 = sortedTwoSum(arr,target);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void testData6(){
        int[] arr = {3,2,4};
        int target = 6;
        int[] arr1 = sortedTwoSum(arr,target);
        System.out.println(Arrays.toString(arr1));
    }


}
