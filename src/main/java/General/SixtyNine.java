package General;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SixtyNine {
    @Test
    public void td1(){
        Assert.assertEquals(findMax(996966),999966);
    }

    public int findMax(int num){
        String temp = String.valueOf(num);
        if(temp.charAt(0)=='6') temp = '9'+temp.substring(1);
        for(int i=1;i<temp.length();i++){
            if(temp.charAt(i)=='6'){
                temp = temp.substring(0,i)+'9'+temp.substring(i+1);
                //System.out.println(temp.charAt(i));
                //temp = temp.replace(temp.charAt(i),'9');
                break;
            }
        }
        System.out.println(temp);
        num=Integer.parseInt(temp);
        System.out.println(num);
        return num;
    }
}
