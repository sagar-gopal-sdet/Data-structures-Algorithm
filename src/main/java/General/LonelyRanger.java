package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyRanger {

    @Test
    public void td1(){
        Assert.assertEquals(findUnique(Arrays.asList(1,1,2)), 2 );
    }

    public int findUnique(List<Integer> l){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<l.size();i++){
            map.put(l.get(i),map.getOrDefault(l.get(i),0)+1);
        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()==1) return m.getKey();
        }
        return 0;
    }
}
