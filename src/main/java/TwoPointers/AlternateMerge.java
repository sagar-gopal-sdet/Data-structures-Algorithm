package TwoPointers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlternateMerge {

    @Test
    public void testData1() {
        Assert.assertEquals(mergeAlternateChars("abc", "pqr"), "apbqcr");
    }

    @Test
    public void testData2() {
        Assert.assertEquals(mergeAlternateChars("abc", ""), "abc");
    }

    @Test
    public void testData3() {
        Assert.assertEquals(mergeAlternateChars("", "pqr"), "pqr");
    }

    @Test
    public void testData4() {
        Assert.assertEquals(mergeAlternateChars("a", "pqr"), "apqr");
    }

    @Test
    public void testData5() {
        Assert.assertEquals(mergeAlternateChars("abc", "p"), "apbc");
    }

    @Test
    public void testData6() {
        Assert.assertEquals(mergeAlternateChars("abc", ""), "abc");
    }

    /*Psudocode-
    * Verify if one of the string input length is 0. If yes, return the other string input.
    * ELse, Initialise variable i to hold the minimum length out of 2 inputs.
    * Initialise j variable as 0 for indexing.
    * Declare empty string s.
    * Start while loop with condition until j<i
    * During each iteration, Add jth char from both the inputs.
    * After while loop ends, verify if j is still less than any of the input length.
    * If yes, add the remaining elements from the input directly to the output String s.
    * Return s.*/

    public String mergeAlternateChars(String word1, String word2) {
        String s = "";
        if (word1.length() == 0) return word2;
        else if (word2.length() == 0) return word1;
        else {
            int i = Integer.min(word1.length(), word2.length());
            int j = 0;
            while (j < i) {
                s = s + word1.charAt(j) + word2.charAt(j);
                j++;
            }
            if (j < word1.length()) s += word1.substring(j);
            else if (j < word2.length()) s += word2.substring(j);
            return s;
        }
    }
}