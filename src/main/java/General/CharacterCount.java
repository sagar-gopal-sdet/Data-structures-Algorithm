package General;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CharacterCount {
    @Test
    public void td1(){
        Assert.assertEquals(displayCharacterCountTwoPointers("ZAAVVDDSSSG"),"1Z2A2V2D3S1G");
    }

    public String displayCharacterCount(String s){
        String s1 = "";
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            set.add(s.charAt(i));
        }
        for(int i=0;i<set.size();i++){
            s1=s1+map.get(s.charAt(i))+s.charAt(i);
        }
        return s1;
    }

    public String displayCharacterCountTwoPointers(String s){
        String s1 = "";
        char[] ch = s.toCharArray();
        int i=0,j=0,count=0;
        while(j<s.length()){
            if(ch[i]==ch[j]){
                count++;
                j++;
            } else if(ch[i]!=ch[j]){
                s1=s1+count+ch[i];
                count=0;
                i=j;
            }
        }
        s1=s1+count+ch[i];

        return s1;

    }
}
