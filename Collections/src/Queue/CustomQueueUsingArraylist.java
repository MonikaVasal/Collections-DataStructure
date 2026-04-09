package Queue;

import List.ArrayListCustom;

import java.util.StringJoiner;

public class CustomQueueUsingArraylist {
    ArrayListCustom arrayListCustom ;
    CustomQueueUsingArraylist(){
        arrayListCustom=new ArrayListCustom(5);
    }
    public void offer(Object data){
        arrayListCustom.add(data);
    }
    public void poll(){
        if (arrayListCustom.findlength()<1)
            System.out.println("No Element available in the queue");
        arrayListCustom.remove(0);
    }
    public Object peek(){
        return arrayListCustom.get(0);
    }
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(",","{","}");
        for(int i=0;i< arrayListCustom.findlength();i++)
            stringJoiner.add( arrayListCustom.get(i).toString());
        return  stringJoiner.toString();
    }
    static void main(String args[]){
        CustomQueueUsingArraylist cs= new CustomQueueUsingArraylist();
        cs.offer(10);
        cs.offer(20);
        cs.offer(30);
        cs.offer(40);
        cs.offer(50);
        cs.offer(60);
        System.out.println(cs);
        System.out.println(cs.peek());
        cs.poll();
        System.out.println(cs);
    }
}
