package twoPointer;

import org.testng.annotations.Test;

public class ReverseLetters {
    @Test
    public void testData1(){
        String s = "ab-cd";
        System.out.println(lettersOnlyReversed(s));
        //Assert.assertEquals(lettersOnlyReversed("ab-cd"),"dc-ba");
    }
    @Test
    public void testData2(){
        String s = "a-bC-dEf-ghIj";
        System.out.println(lettersOnlyReversed(s));
        //Assert.assertEquals(lettersOnlyReversed("ab-cd"),"dc-ba");
    }



    public String lettersOnlyReversed(String s) {
        System.out.println((int)'-');
        int i=0,j=s.length()-1;
        char[] ch = s.toCharArray();
        while(i<j){
            if(((ch[i]<=90 && ch[i]>=65) || (ch[i]<=122 && ch[i]>=97)) && ((ch[j]<=90 && ch[j]>=65) || (ch[j]<=122 && ch[j]>=97))  ){

                char temp = ch[i];
                ch[i] = ch[j];
                ch[j]=temp;
                i++;
                j--;

            } else if(!(ch[i]<=90 && ch[i]>=65) && !(ch[i]<=122 && ch[i]>=97)){
                i++;
            } else if(!(ch[j]<=90 && ch[j]>=65) || !(ch[j]<=122 && ch[j]>=97)){
                j--;
            }
        }
        s= String.valueOf(ch);
        return s;
    }
}
