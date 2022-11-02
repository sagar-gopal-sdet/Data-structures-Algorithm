package TwoPointers;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortPairity {

    public int[] sortArrayByParity(int[] nums) {
        int i=0 , j=nums.length-1;

        while(i<j){
            if(nums[i] % 2 !=0 && nums[j] %2 == 0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;

            }

            if(nums[i] %2 == 0 && nums[j]%2 == 0){
                i++;
            }

            if(nums[i] %2 == 0 && nums[j]%2 != 0){
                i++;
                j--;
            }

            if(nums[i] %2 != 0 && nums[j]%2 != 0){
                j--;
            }
        }

        return nums;
    }


    @Test
    public void testData1(){
        int[] arr = {1,5,4,2,6,6,8,7,5};
        arr = sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData2(){
        int[] arr = {1,5,-4,2,6,6,8,-7,5};
        arr = sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData3(){
        int[] arr = {1,5,4,0,6,6,0,7,5};
        arr = sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData4(){
        int[] arr = {1,1,1,1,1,1,1,1};
        arr = sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData5(){
        int[] arr = {6};
        arr = sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testData6(){
        int[] arr = {};
        arr = sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }

}
