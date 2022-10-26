package twoPointer;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class ReverseVowels {
    public String reverseVowels(String s){
        ArrayList<Character> al = new ArrayList<Character>();
        char[] ch = s.toCharArray();
        int i=0, j=ch.length-1;
        while(i<=j){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
                al.add(ch[i]);
            }
            i++;
        }


        i=al.size()-1;
        for(int k=0;k<ch.length;k++){
            if(ch[k]=='a' || ch[k]=='e' || ch[k]=='i' || ch[k]=='o' || ch[k]=='u'){
                ch[k]=al.get(i);
                i--;
            }
        }
        s = String.valueOf(ch);
        return s;
    }

    public String reverseVowelsTwoPointer(String s){
        int i=0,j=s.length()-1;
        char[] ch = s.toCharArray();
        String vow = "aeiouAEIOU";
        while(i<j){

            if(vow.contains(Character.toString(ch[i])) && vow.contains(Character.toString(ch[j]))){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            } else if(vow.contains(Character.toString(ch[i])) && !vow.contains(Character.toString(ch[j]))){
                j--;
            } else if(!vow.contains(Character.toString(ch[i])) && vow.contains(Character.toString(ch[j]))){
                i++;
            } else {
                i++;
                j--;
            }
        }
        s=String.valueOf(ch);
        return s;
    }
    @Test
    public void testData1(){
        String s = "hello";

        System.out.println(reverseVowels(s));
        System.out.println(reverseVowelsTwoPointer(s));
    }

}
