package tasks.singleton;

class SingletonClass {

    private static final SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }

    public static void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        singleton.hello();
    }
}
