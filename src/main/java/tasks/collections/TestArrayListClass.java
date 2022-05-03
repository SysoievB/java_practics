package tasks.collections;

public class TestArrayListClass {
    public static void main(String[] args) {
        ListClass<Integer> myArrayList = new ArrayListClass<>();
        myArrayList.add(2);
        myArrayList.add(45);
        myArrayList.add(46);
        myArrayList.remove(2);

        //myArrayList.print();
        myArrayList.set(1,4444);
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.size()+" - size");
        System.out.println("-----------");
        myArrayList.print();
    }
}
