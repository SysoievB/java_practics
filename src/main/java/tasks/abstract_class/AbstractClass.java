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

    public static void main(String[] args) {
        RealClass realClass = new RealClass("real", 14);
        System.out.println(realClass);
        System.out.println("______________");

        AbstractClass abstractClass = new RealClass("abstract",23);
        System.out.println(abstractClass);
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getAge();
    }
}
