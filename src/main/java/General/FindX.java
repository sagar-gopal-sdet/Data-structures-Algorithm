package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class FindX {

    @Test
    public void td1(){
        Assert.assertEquals(findXCount(new int[] {1,2,3}), 2);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findXCount(new int[] {1,1,1}), 0);
    }

    @Test
    public void td3(){
        Assert.assertEquals(findXCount(new int[] {1,5,7}), 0);
    }

    @Test
    public void td4(){
        Assert.assertEquals(findXCount(new int[] {1,7,6}), 1);
    }

    public int findXCount(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(map.containsKey(m.getKey()+1)) count+=map.get(m.getKey()+1);
        }
        return count;
    }
}
