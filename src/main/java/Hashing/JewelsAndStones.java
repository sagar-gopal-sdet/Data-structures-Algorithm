package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelsAndStones {
    @Test
    public void td1(){
        Assert.assertEquals(findJewels("aA","aAAbbbbb"),3);
    }

    /*Pseudocode-Bruteforce:
    * Initialise count as 0
    * Iterate over the stones string using for loop with range i=0 to stones.length
    * For each char in stones, check if Jewels String contains the ith element of stones.
    * If yes, increment count.
    * Return count after for loop ends.*/
    public int findJewels(String jewels, String stones){
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))>=0) count++;
        }
        return count;
    }


    public int findJewelsOptimised(String jewels, String stones){
        int count=0;
        for(char c:stones.toCharArray()){
            if(jewels.indexOf(c)!=-1) count++;
        }
        return count;
    }
}
