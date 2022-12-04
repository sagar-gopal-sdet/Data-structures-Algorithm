package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindIndex {
    @Test
    public void td1(){
        Assert.assertEquals(findIndexUsingBinarySearch(new int[] {-1,0,3,5,9,12},9),4);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findIndexUsingBinarySearch(new int[] {-1,0,3,5,9,12},11),4);
    }

    @Test
    public void td3(){
        Assert.assertEquals(findIndexUsingBinarySearch(new int[] {1,3,5,7},6),3);
    }

    @Test
    public void td4(){
        Assert.assertEquals(findIndexUsingBinarySearch(new int[] {1,3,5,6},7),4);
    }

    @Test
    public void td5(){
        Assert.assertEquals(findIndexUsingBinarySearch(new int[] {1,3,5,6},0),0);
    }

    public int findIndexUsingTwoPointers(int[] arr, int n){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==n) return i;
            if(arr[j]==n) return j;
            i++;
            j--;
        }
        return -1;
    }

    public int findIndexUsingBinarySearch(int[] arr, int n){
        int left = 0, right=arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<n) left=mid+1;
            else if(arr[mid]>n) right=mid-1;
            else if (arr[mid]==n) return mid;
        }
        return left-1;
    }
}
