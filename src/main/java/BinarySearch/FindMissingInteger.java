package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FindMissingInteger {
    @Test
    public void td1(){
        Assert.assertEquals(findkthMissingElement(new int[] {2,3,4,7,11}, 5), 9);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findkthMissingElement(new int[] {1,2,3,4}, 2), 6);
    }

    /*Pseudocode-
    * Initialize missing element var n=0, i=1.
    * Iterate over the arr using while loop with condition k>0
    * if arr[i] != i, reassign n=i, Increment i and decrement k.
    * After while loop ends, return n
    * */

    public int findkthMissingElement(int[] arr, int k){
        List<Integer> al = new ArrayList<>();
        for(int i=1;i<=arr[arr.length-1];i++){
            al.add(i);
        }
        for(int i=0;i<arr.length;i++){
            al.remove(Integer.valueOf(arr[i]));
        }
        int n;
        if(al.size()!=0) n=al.get(al.size()-1)+1;
        else n=arr[arr.length-1]+1;
        while(al.size()<=k){
            al.add(n);
            n++;
            k--;
        }
        return al.get(k-1);
    }
}
