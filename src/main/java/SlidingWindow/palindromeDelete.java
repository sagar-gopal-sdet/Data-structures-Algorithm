package SlidingWindow;

public class palindromeDelete {

    /*PSEUDOCODE-
    * Initialise i=0, j= string length-1, count=0
    * Iterate over while loop with condition*/
    public boolean palindromeAfterDeletion(String s){
        int i=0, j=s.length()-1, count=0;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                break;
            }
            i++;
            j--;
        }
        while(i+1<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        while(i<j-1){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
