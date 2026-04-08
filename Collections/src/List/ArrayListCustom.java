package List;

import javax.xml.transform.Source;
import java.util.Arrays;

public class ArrayListCustom {
    Object ar[];
    int count = 0;

    public ArrayListCustom(int size) {
        ar = new Object[size];
    }

    public void add(Object data) {
        if (count >= ar.length) {
            int newsize = ar.length + (ar.length / 2);
            ar = Arrays.copyOf(ar, newsize);
        }
        ar[count++] = data;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(ar, count));
    }

    public Object get(int index) {
        if (count < index) {
            return "Given index is greater than size of array and element is not available at this position";
        } else {
            return ar[index];
        }
    }

    public int findlength() {
        return count;
    }

    public Object remove(int position) {
        if(position<0 || position>count)
            return "Invalid Index";
        else if(position ==count){
            Object val= ar[position];
            ar[position]=null;
        }
        else{
            for(int i=position;i<count-1;i++){
                ar[i]=ar[i+1];
            }
            ar[count-1]=null;
            count--;
        }
        return "Removed";
    }

    static void main(String[] args) {
        ArrayListCustom arrayListCustom = new ArrayListCustom(5);
        arrayListCustom.add(67);
        arrayListCustom.add(87);
        arrayListCustom.add(45);
        arrayListCustom.add(32);
        arrayListCustom.add(89);
        arrayListCustom.add(87);
        arrayListCustom.add(889);
        arrayListCustom.add(871);
        arrayListCustom.add(873);
        System.out.println(arrayListCustom);
        System.out.println(arrayListCustom.get(2));
        System.out.println(arrayListCustom.get(7));
        System.out.println(arrayListCustom.findlength());
        System.out.println(arrayListCustom.remove(4));
        System.out.println(arrayListCustom);
    }
}