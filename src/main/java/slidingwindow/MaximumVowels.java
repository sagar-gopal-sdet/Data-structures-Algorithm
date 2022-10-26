package slidingwindow;

public class MaximumVowels {

    /*Pseudocode-
    * - Initialise maxCount and tempCount as 0*/

    public int findMaxVowels(String s, int k){
        int maxCount = 0, tempCount=0;
        String vow = "aeiouAEIOU";
        char[] ch = s.toCharArray();

        for(int i=0;i<k;i++){
            if(vow.contains(Character.toString(ch[i]))) {
                tempCount++;
            }
        }
        maxCount = Integer.max(maxCount,tempCount);
        for(int i=k;i<ch.length;i++){
            if(vow.contains(Character.toString(ch[i])) && !vow.contains(Character.toString(ch[i-k]))) tempCount++;
            if(!vow.contains(Character.toString(ch[i])) && vow.contains(Character.toString((ch[i-k])))) tempCount --;

            maxCount = Integer.max(maxCount,tempCount);

        }

        return maxCount;
    }
}
