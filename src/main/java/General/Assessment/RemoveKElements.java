package General.Assessment;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class RemoveKElements {

    @Test
    public void td1(){
        Assert.assertEquals(removeElements("deeedbbcccbdaa", 3), "aa");
    }

    @Test
    public void td2(){
        Assert.assertEquals(removeElements("deeedbbcccbdaaa",3), "");
    }

    @Test
    public void td3(){
        Assert.assertEquals(removeElements("deeedbbcccbbdaa",3), "ddbdaa");
    }

    @Test
    public void td4(){
        Assert.assertEquals(removeElements("deeedbbcccbbdaa",0), "deeedbbcccbbdaa");
    }

    /*Pseudocode-
    * Initialise a list of characters
    * Iterate through the characters of the string.
    * Verify if the current character is equal to last k elements in the list.
    * If not, add the current element to the list, else remove last k elements from the list
    * Return the string value of list characters*/

    public String removeContinuousKElements(String s,int k){
        if(k==0) return s;
        List<Character> output = new ArrayList<>();
        for(char c:s.toCharArray()){
            int temp = k-1,i=output.size()-1,flag=0;

            if(output.size()>=k && c == output.get(i)){
                while(temp>0){
                    if(c!=output.get(i)){
                        flag=1;
                        break;
                    }
                    else {
                        temp--;
                        i--;
                    }
                }
                if(flag==0){
                    for(int j=0;j<k-1;j++){
                        output.remove(output.size()-1-j);
                    }
                } else output.add(c);
            } else output.add(c);

        }
        String op = "";
        for(char c:output){
            op+=c;
        }

        return op;
    }

    public String removeElements(String s, int k){
        if(k==0) return s;
        if(k==1) return "";

        return s;
    }


}
