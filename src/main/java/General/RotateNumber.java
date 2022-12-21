package General;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RotateNumber {
    @Test
    public void td1(){
        Assert.assertEquals(rotateNumbersKTimes(1234,2),3421);
    }

    public int rotateNumbersKTimes(int n, int k){
        int size = Integer.toString(n).length(), temp = size-1;

        return 0;
    }
}
