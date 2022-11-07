package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    @Test
    public void td1(){
        int[] arr = {1,2,3,4,1,2,3,2,1};
        System.out.println(removeDupes(arr));

    }

    public Set<Integer> removeDupes(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
                al.add(arr[i]);
            } else {
                if(!al.contains(arr[i])){
                    set.add(arr[i]);
                }
            }
        }
        return set;
    }
}
