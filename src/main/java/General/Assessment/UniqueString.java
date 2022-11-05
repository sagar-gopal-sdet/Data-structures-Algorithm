package General.Assessment;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

/*Problem Statement
387. First Unique Character in a String
Easy

6904

233

Add to List

Share
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1


Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.*/

public class UniqueString {

    /*TEST DATA*/
    @Test
    public void td1(){
        Assert.assertEquals(findUniqueCharacterSimplified("leetcode"),0);
    }

    @Test
    public void td2(){
        Assert.assertEquals(findUniqueCharacterWithMap("loveleetcode"),2);
    }

    @Test
    public void td3(){
        Assert.assertEquals(findUniqueCharacterWithMap("aabb"),-1);
    }

    /*Pseudocode-Bruteforce
    * Iterate the String using for loop with i range 0 to String length
    * Initialise flag as 0
    * Initialise nested for loop with j range 0 to String length
    * If character at ith position is equal to jth character, change flag to 1.
    * In the outer for loop, check if flag is 0. If flag is 0, return i*/

    /*Bruteforce code*/
    public int findUniqueCharacter(String s){
        for(int i=0;i<s.length();i++){
            int flag = 0;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }

    /*Pseudocode-Optimised
    * Create Hashmap object and add the string char as key and occurrences as value.
    * Iterate through the string using for loop of range i to 0.
    *  */

    public int findUniqueCharacterWithMap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }

    public int findUniqueCharacterSimplified(String s){

        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) return i;
        }

        return -1;
    }


}
