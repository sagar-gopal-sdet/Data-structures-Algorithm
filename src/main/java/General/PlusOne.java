package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PlusOne {

    @Test
    public void td1(){

        Assert.assertEquals(addPlusOne(new int[] {1,2,3}), new int[] {1,2,4});
    }

    @Test
    public void td2(){
        Assert.assertEquals(addPlusOne(new int[] {1,2,9}), new int[] {1,3,0});
    }

    @Test
    public void td3(){
        Assert.assertEquals(addPlusOne(new int[] {9,8,7,6,5,4,3,2,1,0}), new int[] {9,8,7,6,5,4,3,2,1,1});
    }

    public int[] addPlusOne(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            temp = (temp*10) + arr[i];
            System.out.println(i + "," + temp);
        }
        temp+=1;
        System.out.println(temp);
        while(temp>0){
            al.add(0,temp%10);
            temp = temp/10;
        }
        int[] out = new int[al.size()];
        for(int i=0;i<al.size();i++){
            out[i]=al.get(i);
        }
        return out;
    }
}
