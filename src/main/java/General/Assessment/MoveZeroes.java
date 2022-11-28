package General.Assessment;

import java.util.ArrayList;

public class MoveZeroes {

    public int[] moveZeroesWithOrderMaintained(int[] arr){

        ArrayList<Integer> al = new ArrayList<>();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) al.add(arr[i]);
        }
        int i=0;
        for(;i<al.size();i++){
            arr[i] = al.get(i);
        }
        i+=1;
        while(i<arr.length){
            arr[i] = 0;
            i++;
        }
        return arr;
    }
}
