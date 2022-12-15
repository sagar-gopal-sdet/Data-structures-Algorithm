package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingNumber {
    @Test
    public void td1(){
        Assert.assertEquals(findMissing(new int[] {1,2,3,4,5,7,8}, 8),6);
    }

    public int findMissing(int[] nums,int n){
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=nums[i];
        }
        int actualSum=(n*(n+1))/2;
        return actualSum-sum;
    }
}
