package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class CommonWord {
    @Test
    public void td1(){

        Assert.assertEquals(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[] {"hit"}), "ball");

    }

    @Test
    public void td2(){

        Assert.assertEquals(mostCommonWord("a.",new String[] {}), "a");

    }

    public String mostCommonWord(String s, String[] banned){
        String output = "";
        HashMap<String,Integer> map = new HashMap<>();

        if(banned.length>1){
            for(int i=0;i<banned.length;i++){
                s=s.replace(banned[i],"");
            }
        } else if(banned.length==1){
            s = s.replace(banned[0],"");
        }

        String[] s1 = s.toLowerCase().split("[^A-Za-z0-9]");

        for(int i=0;i<s1.length;i++){
            map.put(s1[i].toLowerCase(), map.getOrDefault(s1[i].toLowerCase(),0)+1);
        }

        int temp=0;
        for(Map.Entry<String,Integer> val : map.entrySet()){
            if(val.getValue()>temp && val.getKey() != ""){
                temp = val.getValue();
                output = val.getKey();
            }
        }
        System.out.println(output);
        return output;
    }

    public String mostCommonWordOptimised(String p, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        String[] words = p.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        for (String w : words) if (!ban.contains(w)) count.put(w, count.getOrDefault(w, 0) + 1);
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
