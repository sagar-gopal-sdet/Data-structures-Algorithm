package BinarySearch;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SquareRoot {
    @Test
    public void td1(){
        Assert.assertEquals(findSquareRoot(8),2);
    }

    public int findSquareRoot(int x){
        int left=1, right=x,out=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid<=x/mid){
                out=mid;
                left=mid+1;
            } else if(mid>x/mid) right=mid-1;
        }
        return out;
    }
}
