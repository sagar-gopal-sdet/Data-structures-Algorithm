package com.week2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReversePrefix {

    @Test
    public void testData1(){
        Assert.assertEquals(reverseUntilPrefix("xyxzxe",'z'),"zxyxxe");
    }

    public String reverseUntilPrefix(String word, char ch) {
        return word.replaceAll(word.substring(0,word.indexOf(ch)+1),reverseString(word.substring(0,word.indexOf(ch)+1)));
    }

    public String reverseString(String s) {
        int i=0, j=s.length()-1;
        char[] ch = s.toCharArray();
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        s = String.valueOf(ch);
        //System.out.println(s);
        return s;
    }

    
}
