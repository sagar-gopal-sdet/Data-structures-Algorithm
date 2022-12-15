package General.InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class FillTheArray {

    @Test
    public void td1(){
        Assert.assertEquals(fillTheArray(new char[] {'c','a','e','f','b','w','0','0','0'}),new char[] {'c','a','a','e','f','b','b','b','w'});
    }

    @Test
    public void td2(){
        Assert.assertEquals(fillTheArray(new char[] {'a','a','b','c','b','0','0','0','0','0','0'}),new char[] {'a','a','a','a','b','b','b','c','b','b','b'});
    }

    public char[] fillTheArray(char[] nums){
        int i=nums.length-2,j=nums.length-1;
        while(i>=0){
            if(nums[i]=='0' && nums[j]=='0') i--;
            else if(nums[i]!='0' && nums[j]=='0'){
                if(nums[i]=='b'){
                    nums[j--]='b';
                    nums[j--]='b';
                    if(nums[j]=='0'){
                        nums[j--]='b';
                        nums[i--]='0';
                    }

                } else if(nums[i]=='a'){
                    nums[j--]='a';
                    if(nums[j]=='0'){
                        nums[j--]='a';
                        nums[i--]='0';
                    }
                } else {
                    nums[j--]=nums[i];
                    nums[i--]='0';
                }
            } else {
                i--;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));

        return nums;
    }
    }

