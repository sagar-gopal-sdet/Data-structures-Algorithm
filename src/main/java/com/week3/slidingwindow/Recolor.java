package com.week3.slidingwindow;

public class Recolor {
    public int findMinimumRecoloring(String blocks, int k){
        int count = 0, temp=0, n=blocks.length();
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') temp++;
        }
        count = temp;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i-k)=='W' && blocks.charAt(i)=='B') temp--;
            else if(blocks.charAt(i)=='W' && blocks.charAt(i-k)=='B') temp++;
            count = Math.min(temp,count);
        }



        return count;
    }
}
