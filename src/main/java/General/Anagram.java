package General;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Anagram {

    @Test
    public void td1(){
        Assert.assertEquals(anagramCheck("ac", "bb"), false);
    }
/*
    public boolean anagramCheck(String s, String t){
        if(s.length() == t.length()){
            char[] ch = s.toCharArray();
            char[] ch1 = t.toCharArray();
            int s1 = 0, s2=0;

            for(int i=0;i<ch.length;i++){
                s1 += ch[i];
                s2 += ch1[i];
            }

            System.out.println(s1);
            System.out.println(s2);

            if(s1 == s2) return true;

        }

        return false;
    }*/

    public boolean anagramCheck(String s, String t){
        if(s.length() == t.length()){

        }

        return false;
    }
}
