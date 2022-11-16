package SlidingWindow;


import org.testng.Assert;
import org.testng.annotations.Test;

public class palindromeDelete {

    @Test
    public void td1(){
        Assert.assertEquals(validPalindrome("aba"), true);
    }



    /*PSEUDOCODE-
    * Initialise i=0, j= string length-1, count=0
    * Iterate over while loop with condition*/
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
