package General;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class RotateNumber {
    @Test
    public void td1(){
        Assert.assertEquals(rotateNumbersKTimes(1234,2),3421);
    }

    public int rotateNumbersKTimes(int n, int k){
        int size = Integer.toString(n).length(), temp = n;
        ArrayList<Integer> al = new ArrayList<>();

        while(temp>0){
        int reminder=temp%10;
        al.add(0,reminder);
        temp=temp/10;
        }
        for (int i=0;i<k;i++){
            al.add(al.get(0));
            al.remove(0);
        }

        System.out.println(al);
        return 0;
    }
}
