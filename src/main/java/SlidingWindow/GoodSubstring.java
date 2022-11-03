package SlidingWindow;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GoodSubstring {

    @Test
    public void td1() {
        Assert.assertEquals(findGoodSubstring("xyzzaz"), 1);
    }

    @Test
    public void td2() {
        Assert.assertEquals(findGoodSubstring("aababcabc"), 4);
    }

    @Test
    public void td3() {
        Assert.assertEquals(findGoodSubstring("x"), 0);
    }

    public int findGoodSubstring(String s) {
        if(s.length()<3){
            return 0;
        }
        int count = 0, k = 3;
        String temp = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            temp += s.charAt(i);
        }
        if (temp.charAt(0) != temp.charAt(1) && temp.charAt(1) != temp.charAt(2) && temp.charAt(0) != temp.charAt(2))
            map.put(temp, map.getOrDefault(temp, 0) + 1);

        for (int i = k; i < s.length(); i++) {
            temp = temp.substring(1);
            temp += s.charAt(i);
            if (temp.charAt(0) != temp.charAt(1) && temp.charAt(1) != temp.charAt(2) && temp.charAt(0) != temp.charAt(2))
                map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        for (Map.Entry<String, Integer> val : map.entrySet()) {
            count += val.getValue();
        }

        return count;
    }

    public int findGoodSubstringOptimised(String s){
        int count = 0;
        if(s.length()<3) return 0;
        char a = s.charAt(0), b = s.charAt(1), c = s.charAt(2);
        if(a!=b && b!=c && a!=c) count++;
        for(int i=3;i<s.length();i++){
            a=b; b=c; c=s.charAt(i);
            if(a!=b && b!=c && a!=c) count++;
        }
        return count;
    }
}
