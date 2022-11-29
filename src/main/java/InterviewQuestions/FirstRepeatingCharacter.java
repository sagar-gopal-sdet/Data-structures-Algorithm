package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FirstRepeatingCharacter {
    @Test
    public void td1(){
        Assert.assertEquals(findFirstRepeatingCharacter("Sgar"), Character.MIN_VALUE);
    }
    public char findFirstRepeatingCharacter(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                System.out.println(c);
                return c;
            }
            else map.put(c,0);
        }
        return Character.MIN_VALUE;
    }
}
