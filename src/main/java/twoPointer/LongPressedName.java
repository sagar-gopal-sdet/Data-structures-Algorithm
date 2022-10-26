package twoPointer;

import org.testng.annotations.Test;

public class LongPressedName {

    /*Pseudocode
    * Convert both the Strings to char array ch and ch1
    * Initialise i and j as 0 for indexing.
    * Declare a boolean variable flag as false.
    * Compare both the length and if ch1 length is less than ch length, return false.
    * Compare first and last elements of both arrays. If doesn't match, return false.
    * */

    public boolean findName(String name, String typed){
        char[] ch = name.toCharArray();
        char[] ch1 = typed.toCharArray();
        int i=0, j=0;
        boolean flag = false;

        if(ch1.length < ch.length){
            return false;
        } else if (ch[0] != ch1[0] || (ch[ch.length-1] != ch1[ch1.length-1]) ) {
            return false;
        } else if(ch1.length == ch.length){
            for(int k=0;k<ch.length;k++){
                if(ch[k] != ch1[k]){
                    flag = true;
                    break;
                }
            }
        }else{
            while(i< ch.length){
                if(ch[i] == ch1[j]) {


                        i++;
                        j++;

                } else if(ch[i] != ch1[j] && ch[i-1]==ch1[j]){


                    j++;
                } else if(ch[i] != ch1[j] && ch1[j] != ch[i-1]){

                    flag = true;

                    break;
                }
            }

            i=ch.length-1;

            while(j<ch1.length && flag==false){
                if(ch[i] != ch1[j]){
                    flag = true;
                    break;
                } else {
                    j++;
                }
            }


        }

        if(flag == false){
            return true;
        }
            return false;



    }

    @Test
    public void testData1(){
        String name = "saeed";
        String typed = "ssaaedd";
        System.out.println(findName(name, typed));
    }

    @Test
    public void testData2(){
        String name = "alex";
        String typed = "aaleexx";
        System.out.println(findName(name, typed));
    }

    @Test
    public void testData3(){
        String name = "alex";
        String typed = "nalexxx";
        System.out.println(findName(name, typed));
    }

    @Test
    public void testData4(){
        String name = "alex";
        String typed = "alexxxnn";
        System.out.println(findName(name, typed));
    }

    @Test
    public void testData5(){
        String name = "alex";
        String typed = "aaleexeex";
        System.out.println(findName(name, typed));
    }

    @Test
    public void testData6(){
        String name = "bdad";
        String typed = "bbbd";
        System.out.println(findName(name, typed));
    }


}
