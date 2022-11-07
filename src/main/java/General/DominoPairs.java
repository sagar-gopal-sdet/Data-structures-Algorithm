package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class DominoPairs {

    @Test
    public void td1(){
        Assert.assertEquals(findEquivalentDominoPairs(new int[][] {{1,2},{2,1},{3,4},{5,6}}),1);
    }

    public int findEquivalentDominoPairs(int[][] d){
        int count = 0;
        for(int i=0;i<d.length;i++){
            for(int j=i+1;j<d.length;j++){
                if((d[i][0]==d[j][0] || d[i][0]==d[j][1]) && (d[i][1]==d[j][0])||d[i][1]==d[j][1]){
                    count++;
                }
            }
        }
        return count;
    }

    public int findPairsOptimised(int[][] d){
        int i=0,j=1,count=0;
        while(i<j){
            if((d[i][0]==d[j][0] || d[i][0]==d[j][1]) && (d[i][1]==d[j][0])||d[i][1]==d[j][1]){
                count++;
                j++;
            }

        }

        return 0;
    }
}
