package Hashing;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingsAndRods {
    @Test
    public void td1(){
        Assert.assertEquals(findRodsCount("B0B6G0R6R0R6G9"),1);
    }

    public int findRodsCount(String rings){
        HashMap<Character, List<Character>> map = new HashMap<>();

        for(int k=0;k<rings.length();k++){
            map.computeIfAbsent(rings.charAt(k+1),n->new ArrayList<>()).add(rings.charAt(k));
        }

        int count =0;
        for(Map.Entry<Character,List<Character>> val : map.entrySet()){
            System.out.println(val.getValue());
            if(val.getValue().contains('R') && val.getValue().contains('G') && val.getValue().contains('B')) count++;
        }

        return count;
    }
}
