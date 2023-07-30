package Demo2;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int chinese;
    private int english;
    private int math;

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age, int chinese, int english, int math) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", english=" + english +
                ", math=" + math +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int sum1=this.chinese+this.english+this.math;
        int sum2=o.chinese+o.english+o.math;
        if(sum1!=sum2){
            return sum2-sum1;
        }
        else if(o.chinese!=this.chinese){
            return o.chinese-this.chinese;
        }
        else if(o.math!=this.math){
            return o.math-this.math;
        }
        else if(o.english!=this.english){
            return o.english-this.english;
        }
        else if(o.getAge()!=this.getAge()){
            return o.getAge()-this.getAge();
        }
        else return this.getName().compareTo(o.getName());
    }
}
