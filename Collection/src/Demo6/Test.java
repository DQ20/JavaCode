package Demo6;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        String s="afsavsadasscaaxavxafxvastcwavhctacxxacacdvd";
        char x;
        int value;
        TreeMap<Character,Integer> TM=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            x=s.charAt(i);
           if(TM.containsKey(x)){
               value=TM.get(x);
               value++;
               TM.put(x,value);
           }
           else {
               TM.put(x,1);
           }
        }
        System.out.println(TM);
    }
}
