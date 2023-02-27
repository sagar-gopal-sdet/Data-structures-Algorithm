package TwoPointers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {

    @Test
    public void td1(){
        Assert.assertEquals(stringReverse("sagar"), "ragas");
    }

    public String stringReverse(String s){
        char[] ch = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            char temp = ch[i];
            ch[i++]=ch[j];
            ch[j--]=temp;

        }

        return String.valueOf(ch);
    }
}
