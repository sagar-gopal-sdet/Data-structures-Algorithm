package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

public class MorseCode {


    @Test
    public void td1(){
        Assert.assertEquals(findCommonMorseCodeOptimised(new String[] {"gin","zen","gig","msg"}),2);
    }
    @Test
    public void td2(){
        Assert.assertEquals(findCommonMorseCodeOptimised(new String[] {"a"}),1);
    }

    public int findCommonMorseCode(String[] words){
        if(words.length==1) return 1;
        if(words.length==0) return 0;
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for (int i=0;i<words.length;i++){
            int l = 0;
            String temp = "";
            while (l<words[i].length()){
                temp+=m[words[i].charAt(l)-'a'];
                l++;
            }
            set.add(temp);
        }

        return set.size();
    }

    public int findCommonMorseCodeOptimised(String[] words){
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();

        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            int l=0;
            while(l<words[i].length()){
                sb.append(m[words[i].charAt(l)-'a']);
                l++;
            }
            set.add(sb.toString());
        }
        return set.size();
    }

    public int findCommonMorseCodeMoreOptimised(String[] words){

        if(words.length==1) return 1;
        if(words.length==0) return 0;
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++) set.add(convertString(words[i],m));
        return set.size();

    }
    public String convertString(String s, String[] m){
        StringBuilder sb = new StringBuilder();
        int l=0;
        while(l<s.length()){
            sb.append(m[s.charAt(l)-'a']);
            l++;
        }
        return sb.toString();
    }
}
