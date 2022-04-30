package tasks.abstract_class;

class AbstractClass {
    private String name;
    private int age;

    public AbstractClass(String name, int age) {
        System.out.println("I am from abstract class");
        this.name = name;
        this.age = age;
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
}

class RealClass extends AbstractClass {

    public RealClass(String name, int age) {
        super(name, age);
        System.out.println("I am from real class");
    }

    public void foo() {
        String m = "Hello";
        System.out.println(m);
        bar(m);
        System.out.println(m);
    }

    public void bar(String m) {
        m += " world!";
    }

    public static void main(String[] args) {
        RealClass realClass = new RealClass("real", 14);
        System.out.println(realClass);
        realClass.foo();
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getAge();
    }
}
