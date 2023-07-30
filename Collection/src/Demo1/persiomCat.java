package Demo1;

public class persiomCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只名字叫"+getName()+"的"+getAge()+"岁波斯猫在吃小饼干");
    }
}
