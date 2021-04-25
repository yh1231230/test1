package mycollection;

public class MyArrayList<E> {
    private Object[] elementData;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("容量不能为负数！");
        } else if (capacity == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            elementData = new Object[capacity];
        }
    }

    public void add(E element) {
        elementData[size++] = element;
        //自动扩容
        if (size == elementData.length) {
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
    }

    public void remove(int index) {
        int copyNum=elementData.length-index-1;
        if(copyNum>0){
        System.arraycopy(elementData, index+1, elementData, index, copyNum);
        }
            elementData[--size]=null;//将最后一位变为空，size减1
    }

    public void remove(E element){
        for(int i=0;i<size;i++){
            if(element.equals(get(i))){
                remove(i);
            }
        }
    }


    public E get(int index) {
        check(index);
        return (E) elementData[index];
    }

    public void set(E element, int index) {
        check(index);
        elementData[index] = element;
    }

    public void check(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引错误：" + index);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i]).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MyArrayList<String> my1 = new MyArrayList<>(10);
        for (int i = 0; i < 12; i++) {
            my1.add("yh" + i);
        }
        my1.remove("yh0");
        System.out.println(my1.get(0));
        my1.set("yh55",5);
        System.out.println(my1.get(5));
        System.out.println(my1);
        my1.get(11);
    }
}
