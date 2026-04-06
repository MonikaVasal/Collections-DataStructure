package List;

import javax.xml.transform.Source;
import java.util.Arrays;

public class ArrayListCustom {
    Object ar[];
    int count=0;

    public ArrayListCustom(int size) {
        ar = new Object[size];
    }

    public void add(Object data){
         if(count>=ar.length){
             int newsize= ar.length+(ar.length/2);
             ar=Arrays.copyOf(ar, newsize);
         }
         ar[count++]=data;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(ar, count));
    }
    public Object get(int index){
        if(count<index){
            return "Given index is greater than size of array and element is not available at this position";
        }
        else{
            return ar[index];
        }
    }

    static void main(String[] args) {
        ArrayListCustom arrayListCustom = new ArrayListCustom(5);
        arrayListCustom.add(67);
        arrayListCustom.add(87);
        arrayListCustom.add(45);
        arrayListCustom.add(32);
        arrayListCustom.add(89);
        arrayListCustom.add(87);
        System.out.println(arrayListCustom);
        System.out.println(arrayListCustom.get(2));
        System.out.println(arrayListCustom.get(7));
    }
}