package Stack;

import List.ArrayListCustom;

import java.util.StringJoiner;

public class CustomStackUsingArrayList {
    ArrayListCustom arrayListCustom ;
    CustomStackUsingArrayList(){
        arrayListCustom=new ArrayListCustom(5);
    }
    public void push(Object data){
        arrayListCustom.add(data);
    }
    public void pop(){
        if (arrayListCustom.findlength()<1)
            System.out.println("Underflow");
        arrayListCustom.remove(arrayListCustom.findlength()-1);
    }
    public Object peek(){
        return arrayListCustom.get(arrayListCustom.findlength()-1);
    }
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(",","{","}");
        for(int i=0;i< arrayListCustom.findlength();i++)
            stringJoiner.add( arrayListCustom.get(i).toString());
        return  stringJoiner.toString();
    }

    static void main(String[] args) {

        CustomStackUsingArrayList customStackUsingArrayList=new CustomStackUsingArrayList();
        customStackUsingArrayList.push(10);
        customStackUsingArrayList.push(20);
        customStackUsingArrayList.push(30);
        customStackUsingArrayList.push(40);
        customStackUsingArrayList.push(50);
        customStackUsingArrayList.push(60);
        customStackUsingArrayList.push(70);
        customStackUsingArrayList.push(80);
        System.out.println(customStackUsingArrayList);
        System.out.println(customStackUsingArrayList.peek());
        customStackUsingArrayList.pop();
        System.out.println(customStackUsingArrayList);
        customStackUsingArrayList.pop();
        System.out.println(customStackUsingArrayList);
        customStackUsingArrayList.pop();
        System.out.println(customStackUsingArrayList);
        System.out.println(customStackUsingArrayList.peek());


    }
}
