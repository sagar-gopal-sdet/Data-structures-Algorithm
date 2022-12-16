package SlidingWindow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NiceString {

    @Test
    public void td1(){
        Assert.assertEquals(findNiceString("YazaAay"),"aAa");
    }

    public String findNiceString(String s){
        String out = "",temp = ""+s.charAt(0);
        int i=0,j=1;
        while(j<s.length()){

            temp = ""+s.charAt(i);
            if(Math.abs(s.charAt(i)-s.charAt(j))==32){
                temp += s.charAt(j++);
            } else {
                i++;
                j++;
            }
            if(temp.length()>out.length()) out = temp;
        }

        return out;
    }
}
