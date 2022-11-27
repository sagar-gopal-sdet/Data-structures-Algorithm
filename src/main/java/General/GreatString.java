package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

public class GreatString {
    @Test
    public void td1(){
        Assert.assertEquals(findGreatString("leEeetcode"),"leetcode");
    }

    public String findGreatString(String s){
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        for(char c:s.toCharArray()){

        }
        return new String();
    }
}
