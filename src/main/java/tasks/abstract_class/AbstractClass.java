package tasks.abstract_class;

class AbstractClass {

    public AbstractClass() {
        System.out.println("I am from abstract class");
    }
}

class RealClass extends AbstractClass {

    public RealClass() {
        super();
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
        RealClass realClass = new RealClass();
        realClass.foo();
    }
}
