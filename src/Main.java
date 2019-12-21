public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList=new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.printArray();

        arrayList.remove(2);
        arrayList.printArray();
    }
}
