package TwoPointers;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveElement {
    public int removeElementInInputArray(int[] nums, int val){
        int k=0, i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
                i++;
            } else {
                i++;
            }
        }

        return k;
    }

    @Test
    public void testData1(){
        int[] arr = {1,5,4,2,6,6,8,7,5};
        int k = removeElementInInputArray(arr,5);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData2(){
        int[] arr = {1,5,-4,2,6,6,8,-7,5};
        int k = removeElementInInputArray(arr,5);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData3(){
        int[] arr = {3,3};
        int k = removeElementInInputArray(arr,5);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData4(){
        int[] arr = {1};
        int k = removeElementInInputArray(arr,1);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData5(){
        int[] arr = {};
        int k = removeElementInInputArray(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData6(){
        int[] arr = {3,3};
        int k = removeElementInInputArray(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
