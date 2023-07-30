package Demo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Husky dog1=new Husky();
        Tidy dog2=new Tidy();
        persiomCat cat1=new persiomCat();
        lihuaCat cat2=new lihuaCat();
        dog1.setName("囧太郎");
        dog1.setAge(1);
        dog2.setName("Ti");
        dog2.setAge(2);
        cat1.setName("喵");
        cat1.setAge(3);
        cat2.setName("呜");
        cat2.setAge(4);
        ArrayList list=new ArrayList();
        list.add(dog1);
        list.add(dog2);
        list.add(cat1);
        list.add(cat2);
        keepPet1(list);
    }
    public static void keepPet(ArrayList< ? extends Animal> list){
        for (Animal A:
             list) {
            A.eat();
        }
    }
    public static void keepPet1(ArrayList< ? extends Dog> list){
        for (Dog D:
                list) {
            D.eat();
        }
    }
    public static void keepPet2(ArrayList< ? extends Cat> list){
        for (Cat C:
                list) {
            C.eat();
        }
    }
}