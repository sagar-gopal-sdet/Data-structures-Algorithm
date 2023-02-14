package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMinimum {

    @Test
    public void td1(){
        Assert.assertEquals(findMinimumValueFromRotatedArray(new int[] {4,5,1,2,3}),1);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findMinimumValueFromRotatedArray(new int[] {1,2,3,4,5}),1);
    }

    @Test
    public void td3(){
        Assert.assertEquals(findMinimumValueFromRotatedArray(new int[] {6,7,8,9,11,1,2,3,4,5}),1);
    }

    public int findMinimumValueFromRotatedArray(int[] arr){
            if(arr[0]<arr[arr.length-1]) return arr[0];
            int min=Integer.MIN_VALUE;
            int left = 0, right = arr.length-1, mid;
            while(left<right){
                mid = (left+right)/2;
                if(arr[left] > arr[mid]) {
                    min = Integer.min(min,arr[mid]);
                    right = mid;
                }
                else if (arr[right] < arr[mid+1]) {
                    min = Integer.min(min,arr[mid+1]);
                    left = mid+1;
                } else return arr[mid+1];

            }

            return min;
    }
}
