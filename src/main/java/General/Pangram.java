package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    @Test
    public void td1(){
        Assert.assertEquals(verifyPangram("We promptly judged antique ivory buckles for the next prize"),"pangram");
    }
    @Test
    public void td2(){
        Assert.assertEquals(verifyPangram("abcd"),"not pangram");
    }

    public String verifyPangram(String s){
        Set<Character> set = new HashSet<>();
        s = s.toLowerCase();
        for(char c:s.toLowerCase().toCharArray()){
            if(c != ' '){
                set.add(c);
            }
        }
        if(set.size()!=26) return "not pangram";
        return "pangram";
    }
}
