package Demo1;

public class Husky extends Dog{
    @Override
    public void eat() {
        System.out.println("一只名字叫"+getName()+"的"+getAge()+"岁哈士奇在吃东西，并在拆家");
    }
}
