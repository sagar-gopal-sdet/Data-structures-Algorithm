package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {
    @Test
    public void test()
    {
        String roman = "MCMXCIV";
        Assert.assertEquals(1994, romanToInt(roman));
    }

    public int romanToInt(String s){

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        int prev = 1;
        for(int i = 0; i < s.length(); i++) {
            if(i != s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1)) ) sum -= map.get(s.charAt(i));
            else sum += map.get(s.charAt(i));
        }

        return sum;
    }

    public int romanToIntAlternateWay(String roman){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){
            {
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);
            }
        };
        int result = 0;
        int prev = 1;
        for(int i = roman.length()-1; i >= 0; i--){
            if(map.get(roman.charAt(i)) >= prev) result += map.get(roman.charAt(i)); //5 104 1094 1894
            else result -= map.get(roman.charAt(i));   // 4  94  994 894
            prev = map.get(roman.charAt(i)); // 5 104 94 1094 994 894
        }
        return result;
    }

}
