package Demo4;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
     char[] arr={'A','B','C','D'};
        Random r=new Random();
        char M=0;
        int x=0;
        HashMap<Character,Integer> hm=new HashMap();
        for (int i=0;i<80;i++){
            int count=r.nextInt(arr.length);
            M=arr[count];
            if(hm.containsKey(M)){
                int value=hm.get(M);
                value++;
                hm.put(M,value);
            }
            else
            {
                hm.put(M,1);
            }
        }
        for (Map.Entry<Character,Integer> W:
                hm.entrySet()) {
            if(W.getValue()>x){
                x=W.getValue();
                M=W.getKey();
            }
        }
        System.out.println(hm);
        System.out.println(M+"最多，为"+x+"票");
    }
}
