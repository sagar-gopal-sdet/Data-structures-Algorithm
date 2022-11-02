package Hashing;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueEmail {

    @Test
    public void td1(){
        Assert.assertEquals(findUniqueEmailCount(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}),2);
    }

/*Pseudocode:
Initialise Hashset for String.
Interate the input array using for loop with range s.length
Split the string with "@" as delimiter and store it in s1
Override s1[0] -> Replace "." with empty value in first element of s1, remove the values beyond "++ and add "@" + second element of s1.
Add the s1[0] to set.
After the for loop ends, return size of set.

* */

    public int findUniqueEmailCount(String[] s){
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<s.length;i++){
            String[] s1 = s[i].split("@");
            s1[0] = s1[0].replace(".","").split("\\+")[0]+"@"+s1[1];
            set.add(s1[0]);
        }


        return set.size();
    }
}
