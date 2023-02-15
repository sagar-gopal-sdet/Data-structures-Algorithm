package General;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LastStringLength {

    @Test
    public void td1(){
        Assert.assertEquals(findLastWordLength("Hello World"), 5);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findLastWordLength("World"), 5);
    }

    public int findLastWordLength(String s){
        if(s.length()==0) return 0;
        s = s.trim();
        int i=s.length()-1, count=0;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}
