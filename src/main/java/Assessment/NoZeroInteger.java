package Assessment;
public class NoZeroInteger {

    public int[] getNoZeroIntegers(int n) {

        /* Test Data:

    @Test
    public void testData1(){

        Assert.assertEquals(getNoZeroIntegers(2), new int[]{1, 1});
    }

    @Test
    public void testData2(){
        Assert.assertEquals(getNoZeroIntegers(11), new int[]{2, 9});
    }

    @Test
    public void testData2(){
        Assert.assertEquals(getNoZeroIntegers(21), new int[]{2, 19});
    }

    Bruteforce Pseudocode-
    * Initialise an output array with length 2
    *


   Bruteforce code:*/

        int[] output = new int[2];
        int i=1,j=n-1;

        while(i<j){
            if(containsZeroOrNot(i) && containsZeroOrNot(j)){
                output[0]=i;
                output[1]=j;
            }
        }


        return output;


        /* Algorithm pesudocode:
         */


    }
    public boolean containsZeroOrNot(int n){
        String s = n + "";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==0) return false;
        }
        return true;
    }
}
