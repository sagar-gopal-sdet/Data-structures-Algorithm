package General;

import org.testng.Assert;

import java.util.*;

public class GroupAnagrams {

    /*
    *
    * 49. Group Anagrams
Medium

13138

389

Add to List

Share
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
*/

    public void td1(){

    }

    /* Pseudocode-
     * If String[] is empty, return empty.
     * Create a HashMap out with HashMap<Character,Integer> as key and List<String> as value.
     * Iterate the input
     * Create a Hashmap and add each item to hashmap.
     * Check if its already in hashmap, if yes get the value of the hashmap and append the current item to the list.
     * else add to HashMap out
     * return values of the HashMap
     */

    public List<List<String>> groupAllAnagrams(String[] s){

        HashMap<Map<Character,Integer>,List<String>> map = new HashMap<>();
        for(int i=0;i<s.length;i++){
            HashMap<Character,Integer> m = new HashMap<>();
            for(int j=0;j<s[i].length();i++){
                m.put(s[i].charAt(j),m.getOrDefault(s[i].charAt(j),0)+1);
            }
            if(map.containsKey(m)){
                List<String> tempList = map.get(s[i]);
                tempList.add(s[i]);
            } else {
                List<String> t = new ArrayList<>(Arrays.asList(s[i]));
                map.put(m,t);
            }
        }

        List<List<String>> flist = new ArrayList<>();
        flist.addAll(map.values());

        return flist;

    }
}
