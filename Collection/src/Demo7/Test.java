package Demo7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        ArrayList grils=new ArrayList();
        ArrayList boys=new ArrayList();
        ArrayList x=new ArrayList();
        Random r=new Random();
        Collections.addAll(x,0,0,0,1,1,1,1,1,1,1);
        Collections.shuffle(x);
        Collections.addAll(grils,"女1","女2","女3","女4","女5");
        Collections.addAll(boys,"男1","男2","男3");
        if(x.get(1).equals(0)){
            System.out.println(grils.get(r.nextInt(grils.size())));
        }
        else {
            System.out.println(boys.get(r.nextInt(boys.size())));
        }
    }
}
