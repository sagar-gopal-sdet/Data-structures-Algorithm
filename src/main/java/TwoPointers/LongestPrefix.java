package TwoPointers;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class LongestPrefix {
    @Test
    public void td1(){
        Assert.assertEquals(findLongestCommonPrefix(new String[] {"flower","flow","flight"}), "fl");
    }

    @Test
    public void td2(){
        Assert.assertEquals(findLongestCommonPrefix(new String[] {"dog","racecar","car"}), "");
    }

    public String findLongestCommonPrefix(String[] s){
        Arrays.sort(s);
        char[] ch = s[0].toCharArray();
        char[] ch1 = s[s.length-1].toCharArray();
        String out = "";
        for(int i=0;i<ch.length;i++){
            if(ch1.length>i && ch[i]==ch1[i]) out+=ch[i];
            else break;
        }
        return out;
    }

}
