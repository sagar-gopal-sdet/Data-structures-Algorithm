package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupesAndMaintainOrder {

    @Test
    public void td1(){
        Assert.assertEquals(removeDupes1(new int[] {0,0,1,1,1,2,2,3,3,4}), 5);
    }

    public int removeDupes(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(s.add(arr[i])) al.add(arr[i]);

        }
        for(int i=0;i<al.size();i++){
            arr[i]= al.get(i);
        }
        return al.size();
    }

    public int removeDupes1(int[] arr){
        int k=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]) arr[k++]=arr[i];
        }
        return k;
    }
}
