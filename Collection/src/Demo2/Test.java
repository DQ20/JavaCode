package Demo2;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("张三",23,97,86,79);
        Student s2=new Student("李四",23,100,100,59);
        Student s3=new Student("王五",25,99,89,94);
        Student s4=new Student("赵六",26,78,78,67);
        Student s5=new Student("段七",21,89,100,86);
        TreeSet<Student> ts=new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for(Student s:ts){
            System.out.println(s);
        }
    }
}
