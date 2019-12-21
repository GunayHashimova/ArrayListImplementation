import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    private int sizeOfArrayList;

    private T[] array;

    public MyArrayList() {
        array = (T[]) new Object[0];
    }

    public MyArrayList(int sizeOfArrayList) {
        array = (T[]) new Object[sizeOfArrayList];
    }

    public void increaseSize(){
        int newSize=sizeOfArrayList+1;
        array=Arrays.copyOf(array, newSize);
    }

    public void add(T item){
        if(array.length==sizeOfArrayList){
            increaseSize();
        }
        array[sizeOfArrayList++]=item;
    }

    public void remove(int index) {
        T item = array[index];
        for (int i = index; i < sizeOfArrayList - 1; i++) {
            array[i] = array[i + 1];
        }
        sizeOfArrayList--;
    }

    public void printArray(){
        System.out.print("[");
        for (int i = 0; i < sizeOfArrayList; i++) {
            if (i != sizeOfArrayList - 1) System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
