package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {

    @Test
    public void td1(){
        Assert.assertEquals(findFirstNonRepeatingChar("aabbcdd"),'c');
    }

    @Test
    public void td2(){
        Assert.assertEquals(findFirstNonRepeatingChar("aaccddxb"),'x');
    }

    @Test
    public void td3(){
        Assert.assertEquals(findFirstNonRepeatingChar("aabbccdd"),Character.MIN_VALUE);
    }

    public char findFirstNonRepeatingChar(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> m: map.entrySet()){
            if(m.getValue()==1) return m.getKey();
        }
        return Character.MIN_VALUE;
    }
}
