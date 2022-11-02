package TwoPointers;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AssignCookies {
    @Test
    public void td1(){
        Assert.assertEquals(assignCookies(new int[] {1,2,3}, new int[] {1,1}),1);
    }

    public int assignCookies(int[] g, int[] s){
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                count++;
                i++;
                j++;
            } else if(g[i]>s[j]) j++;

        }
        return count;

    }
}
