package LinkedList;

import org.testng.Assert;

import java.util.LinkedList;
import java.util.Stack;

public class BackspaceStrings {

    public void td1(){
        Assert.assertEquals(compareString("ab#c","abb#"),true);
    }

    public boolean compareString(String s, String t){
        Stack<Character> ss = new Stack<>();
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#') ss.push(c);
        }
        return false;
    }
}
