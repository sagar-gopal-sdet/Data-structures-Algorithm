package General.Assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.util.*;

public class AllAnagrams {

    @Test
    public void td1(){
        Assert.assertEquals(findAllAnagrams("cbaebabacd","abc"), Arrays.asList(0,6));
    }

    @Test
    public void td2(){
        Assert.assertEquals(findAllAnagrams("abab","ab"), Arrays.asList(0,1,2));
    }

    @Test
    public void td3(){
        Assert.assertEquals(findAllAnagrams("cbaebabacd","xyz"), Arrays.asList());
    }

    public List<Integer> findAllAnagrams(String s, String p){
        List<Integer> al = new ArrayList<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<p.length();i++){
            map1.put(p.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                map2.put(s.charAt(j), map2.getOrDefault(s.charAt(j),0)+1);
                if(map1.size()==map2.size()) {
                    if (map2.equals(map1)) al.add(i);
                }
            }
            System.out.println(map1.entrySet());
            System.out.println(map2.entrySet());
            map2.clear();

        }
        System.out.println(al);
        return al;
    }


}
