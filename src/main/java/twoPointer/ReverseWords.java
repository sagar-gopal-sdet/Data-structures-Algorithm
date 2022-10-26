package twoPointer;

import org.testng.annotations.Test;

public class ReverseWords {

    public String reverseString(String s){
        int i=0, j=s.length()-1;
        char[] ch = s.toCharArray();
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        s = String.valueOf(ch);
        System.out.println(s);
        return s;
    }



    public String reverseWordsInString(String s){
        String[] arr = s.split(" ");
        s="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>1){
                s += reverseString(arr[i])+ " ";

            } else {
                s += arr[i] + " ";
            }


        }

        return s.strip();
    }

    @Test
    public void testData1(){
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWordsInString(s));
    }
}
