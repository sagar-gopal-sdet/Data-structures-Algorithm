package Recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {
    @Test
    public void td1(){
        Assert.assertEquals(stringReverse(new char[] {'h','e','l','l','o'}), new char[] {'o','l','l','e','h'});
    }

    public char[] stringReverse(char[] s){
        reverseUsingRecursion(0, s.length-1, s);
        return s;
    }
    public void reverseUsingRecursion(int start, int end, char[] c){
        if(start<end){
            char temp = c[start];
            c[start++] = c[end];
            c[end--]= temp;
            reverseUsingRecursion(start,end,c);
        }

    }
}
