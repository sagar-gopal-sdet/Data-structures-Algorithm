package General.Assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class LongestSubstring {
    /*TEST DATA*/
    @Test
    public void td1(){
        Assert.assertEquals(findLongestSubstring("abcabcbb"),3);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findLongestSubstring("bbbbb"),1);
    }

    @Test
    public void td3(){
        Assert.assertEquals(findLongestSubstring("pwwkew"),3);
    }

    /*Pseudocode-Bruteforce

     */

    public int findLongestSubstring(String s){
        if(s.length()==1) return 1;
        if(s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        int window = 0,i=0,j=1;
        while(j<s.length()){
            int temp = set.size();
            set.add(s.charAt(j));
            if(set.size()==temp){
                set.remove(s.charAt(i));
                i++;
                temp = set.size();
            } else {
                temp = set.size();
                j++;
            }
            window =Integer.max(window,temp);
        }

        return window;
    }
}
