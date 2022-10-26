package twoPointer;

import org.testng.annotations.Test;

import java.util.Arrays;

public class sortPairityII {

    public int[] sortPairityIIBruteforce(int[] arr){

        int[] arr1 = new int[arr.length];
        int i=0, j=1;
        for(int k=0;k<arr.length;k++){
            if(arr[k]%2==0){
                arr1[i]=arr[k];
                i=i+2;
            } else {
                arr1[j]=arr[k];
                j=j+2;
            }
        }
        return arr1;
    }
    public int[] sortPairityII(int[] nums){
        int i=0,j=i+1;


        return nums;
    }

    @Test
    public void testData1(){
        int[] arr = {4,2,5,7};
        arr = sortPairityIIBruteforce(arr);
        System.out.println(Arrays.toString(arr));
    }

}
