package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

public class LogFolder {
    @Test
    public void td1(){
        Assert.assertEquals(findMoves(new String[] {"d1/","d2/","./","d3/","../","d31/"}), 2);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findMoves(new String[] {"d1/","d2/","../","d21/","./"}), 2);
    }

    public int findMoves(String[] logs){
        Stack<String> s = new Stack<>();
        for(String c:logs){
            if(!c.equals("../") && !c.equals("./")) s.add(c);
            else if(c.equals("../") && !s.isEmpty()) s.pop();
        }
        return s.size();
    }
}
