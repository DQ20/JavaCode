package Demo5;

import java.util.*;

public class Test{
    public static void main(String[] args) {
        Student s1=new Student("Husky",21);
        Student s2=new Student("zs",23);
        Student s3=new Student("梅西",44);
        Student s4=new Student("ls",23);
        Student s5=new Student("Husky",21);
        TreeMap<Student,String> tm=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()!=o2.getAge()){
                    return o1.getAge()-o2.getAge();
                } else if (o1.getName()!=o2.getName()) {
                    return o1.getName().compareTo(o2.getName());
                }
                return 0;
            }
        });
        tm.put(s2,"广东");
        tm.put(s4,"北京");
        tm.put(s3,"罗萨里奥");
        tm.put(s1,"上海");
        tm.put(s5,"湖南");
        Set<Student> set=tm.keySet();
        for (Student key:set){
            System.out.println(key+"="+tm.get(key));
        }




//        Product p1=new Product(1,"辣条");
//        Product p2=new Product(2,"棒棒糖");
//        Product p3=new Product(3,"铅笔");
//        Product p4=new Product(4,"尺子");
//        Product p5=new Product(5,"西瓜");
//        Product p6=new Product(6,"computer");
//        TreeMap<Integer,String> lhm=new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        lhm.put(p4.getId(),p4.getName());
//        lhm.put(p1.getId(),p1.getName());
//        lhm.put(p5.getId(),p5.getName());
//        lhm.put(p3.getId(),p3.getName());
//        lhm.put(p6.getId(),p6.getName());
//        lhm.put(p2.getId(),p2.getName());
//        System.out.println(lhm);
    }

}
