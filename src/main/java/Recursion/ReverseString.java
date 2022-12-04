package Recursion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {
    @Test
    public void td1(){
        Assert.assertEquals(stringReverseUsingRecursion(new char[] {"h","e","l","l","o"}), new char[] {"o","l","l","e","h"});
    }

    public char[] stringReverseUsingRecursion(char[] s){
                
        return s;
    }
}
