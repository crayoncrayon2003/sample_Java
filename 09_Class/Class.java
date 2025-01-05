
class AAA {
    private String name;
    private int age;

    public AAA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void myOverride() {
        System.out.println("Hello");
    }

    public void myOverload(String name) {
        this.name = name;
    }
}

class BBB extends AAA {
    public BBB(String name) {
        super("Cat", 0);
        this.setName(name);
    }

    @Override
    public void myOverride() {
        System.out.println("Hello Hello!");
    }

    public void myOverload(String name, int age) {
        this.setName(name);
        // super.setAge(age);
    }
}

public class Class {
    public static void main(String[] args) {
        AAA objAAA = new AAA("I am AAA", 10);
        BBB objBBB = new BBB("I am BBB");

        objAAA.myOverride();
        objBBB.myOverride();

        objAAA.myOverload("I am CCC");
        objBBB.myOverload("I am CCC", 30);

        System.out.println(objAAA.getName());
        System.out.println(objBBB.getName());
    }
}
