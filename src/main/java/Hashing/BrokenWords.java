package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrokenWords {
    @Test
    public void td1(){
        Assert.assertEquals(findBrokenWordCountOptimised("hello world", "ad"), 1);
    }

    public int findBrokenWordCount(String text, String brokenLetters){
        String[] s1 = text.split(" ");

        if(brokenLetters.length() == 0) return s1.length;
        String[] b1 = brokenLetters.split("");
        int count = s1.length;
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<b1.length;j++){
                if(s1[i].contains(b1[j])){
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public int findBrokenWordCountOptimised(String text, String b){
        int count = 0;
        String[] s1 = text.split(" ");
        char[] b1 = b.toCharArray();
        for(String x:s1){
            for(char c:b1){
                if(x.indexOf(c)!=-1){
                    count++;
                    break;
                }
            }
        }
        return s1.length-count;
    }
}
