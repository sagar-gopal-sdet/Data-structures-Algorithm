package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class CharacterCountII {
    @Test
    public void td1(){
        Assert.assertEquals(findCount("aaabbccaad"), "a3b2c2a2d1");
    }

    @Test
    public void td2(){
        Assert.assertEquals(findCount(""), "");
    }

    public String findCount(String s){
        if(s.length()==0) return s;
        String s1 = "";
        char[] ch = s.toCharArray();
        int i=0,j=0,count=0;
        while(j<s.length()){
            if(ch[i]==ch[j]){
                count++;
                j++;
            } else if(ch[i]!=ch[j]){
                s1=s1+ch[i]+count;
                count=0;
                i=j;
            }
        }
        s1=s1+ch[i]+count;
        return s1;
    }

    public String findCountHashMap(String s){
        HashMap<Character,Integer> map = new HashMap();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){

            }
        }
        return new String();
    }

}
