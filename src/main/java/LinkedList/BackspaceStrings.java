package LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Stack;

public class BackspaceStrings {

    @Test
    public void td1(){
        Assert.assertEquals(compareString("ab#c","abb#"),false);
    }
    @Test
    public void td2(){
        Assert.assertEquals(compareString("ab#c","#abb#"),false);
    }

    @Test
    public void td3(){
        Assert.assertEquals(compareString("ab##","c#d#"),true);
    }

    public boolean compareString(String s, String t){
        Stack<Character> ss = new Stack<>();
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#') ss.push(c);
            else if(c=='#' && !ss.isEmpty()) ss.pop();
        }
        for(char c:t.toCharArray()){
            if(c!='#') st.push(c);
            else if(c=='#' && !st.isEmpty()) st.pop();
        }
        System.out.println(ss.size());
        System.out.println(st.size());
        if(ss.equals(st)) return true;
        return false;
    }
}
