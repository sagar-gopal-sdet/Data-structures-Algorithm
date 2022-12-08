package General.Assessment;
public class TwoSumII {
    public int[] twoSum(int[] nums, int target) {


    /* Test Data:

    @Test
    public void testData1(){
        int[] arr = {2,7,11,15};
        int target = 9;
        Assert.assertEquals(findTowSumIndices(arr,target), new int[]{1, 2});
    }

    @Test
    public void testData2(){
        int[] arr = {2,3,4};
        int target = 6;
        Assert.assertEquals(findTowSumIndices(arr,target), new int[]{1, 3});
    }

    @Test
    public void testData3(){
        int[] arr = {-1,0};
        int target = -1;
        Assert.assertEquals(findTowSumIndices(arr,target), new int[]{1, 2});
    }

    @Test
    public void testData4(){
        int[] arr = {0,0};
        int target = 0;
        Assert.assertEquals(findTowSumIndices(arr,target), new int[]{1, 2});
    }

    @Test
    public void testData5(){
        int[] arr = {-2,-1};
        int target = -3;
        Assert.assertEquals(findTowSumIndices(arr,target), new int[]{1, 2});
    }

    Bruteforce Pseudocode-
    * Initialise an output array with length 2
    * Iterate the input array using for loop with range i=1 to array length
    * Initiate inner for loop with range of j=1 to array length
    * If j is not equal to i, sum nums[i] and nums[j].
    * If sum equals to target, then return the indices, break the loop.
    *


   // Bruteforce code:

    int[] output = new int[2];
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){

                    if(target == nums[i]+nums[j]){
                        output[0]=i+1;
                        output[1]=j+1;
                        break;
                    }


            }
        }

        return output;


       Algorithm pesudocode:
        * Initialise an output array with length 2
        * Intialise i variable with 0 and j variable with array length - 1
        * Interate the array using while loop with condition i<j
        * If sum of ith element and jth element is equal to target, return the indices and break the loop.
        * If sum is less than target, increment i
        * If sum is greater than target, decrement j

        return output array.*/


        //ALgorithm code
        int[] output = new int[2];
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j] == target){
                output[0]=i+1;
                output[1]=j+1;
                break;
            }
            else if(nums[i]+nums[j]>target) j--;
            else if(nums[i]+nums[j]<target) i++;
        }
        return output;

    }
}
