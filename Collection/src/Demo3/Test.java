package Demo3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Student,String> hm=new HashMap<>();
        Student s1=new Student("Husky",21);
        Student s2=new Student("zs",23);
        Student s3=new Student("ls",26);
        Student s4=new Student("ww",21);
        Student s5=new Student("zl",18);
        hm.put(s1,"湖南");
        hm.put(s2,"香港");
        hm.put(s3,"纽约");
        hm.put(s4,"上海");
        hm.put(s5,"昆明");
        Set<Student> keys=hm.keySet();
        for (Student s:
             keys) {
            System.out.println(s);
        }
//        HashMap<Map.Entry<Student,String>> nodes=hm.entrySet();
//        for (Map.Entry<Student,String> node:
//             nodes) {
//            System.out.println(node.getKey()+"="+node.getValue());
//        }
    }
}
