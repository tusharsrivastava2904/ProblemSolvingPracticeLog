/*
 * Tushar Srivastava
 * #100DaysOfCode
 * tusharsrivastava2904@gmail.com 
*/

//link: https://www.hackerrank.com/challenges/migratory-birds/problem
package ProblemSolving.GFG;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
	public static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> hm = new HashMap<>();
        int key = 0;
        for(int i=0; i<arr.size(); i++) {
            //if key already exists
            if (hm.containsKey(arr.get(i))) {
                hm.put(arr.get(i), hm.get(arr.get(i))+1);
            } else {
                //if a new key has to be added
                hm.put(arr.get(i), 1);
            }
        }
        
        key = Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
        
    }

}
