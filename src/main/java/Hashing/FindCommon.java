package Hashing;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class FindCommon {
    @Test
    public void td1(){
        Assert.assertEquals(findCommonBruteforce(new String[] {"bella","label","roller"}), new String[] {"e","l","l"});
    }

    public HashMap convertIntoMap(String s){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<s.length();i++){
            map.put(""+s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        return map;
    }

    public ArrayList findCommonBruteforce(String[] words){
        ArrayList<String> al = new ArrayList<String>();
        int i=0,j=1;
        while(j<words.length){
            HashMap m1 = convertIntoMap(words[0]);
            HashMap m2 = convertIntoMap(words[0]);


        }


        return al;


    }
}
