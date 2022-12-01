package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    @Test
    public void td1(){
        Assert.assertEquals(verifyUniqueOccurrences(new int[] {1,2,2,3,3,3}), true);
    }

    public boolean verifyUniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> s = new HashSet<>(map.values());
        return map.size()==s.size();
    }
}
