package com.week3.slidingwindow;

import org.testng.annotations.Test;

public class findPalindrome {

    public boolean findPalidromOrNot(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;

    }

    @Test
    public void testData1(){
        String s = "malayalam";

        System.out.println(findPalidromOrNot(s));
    }

    @Test
    public void testData2(){
        String s = "Mala";

        System.out.println(findPalidromOrNot(s));
    }
}


