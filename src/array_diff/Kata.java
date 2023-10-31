package array_diff;

import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        if (a == null||  a.length ==0)
            return new int[] {};
        List<Integer> result = new ArrayList();
        for(int i = 0; i < a.length; i++){
            int number = a[i];
            boolean toDelete = false;
            for(int j = 0; j < b.length; j++){
                if( number == b[j] )
                    toDelete = true;
            }
            if(!toDelete) {
                result.add(number);
            }
        }
        int[] arrayResult = new int[result.size() ];
        int i = 0;
        for(Integer number: result){
            arrayResult[i]= number;
            i++;
        }
        return arrayResult;
    }

}
