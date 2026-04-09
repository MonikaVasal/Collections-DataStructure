package Stack;

import LinkedList.Singly.SinglyLinkedListAtEnd;

public class CustomStackUsingLinkedList {
    SinglyLinkedListAtEnd list;
    CustomStackUsingLinkedList(){
        list=new SinglyLinkedListAtEnd();
    }
    public void push(Object val){
        list.add(val);
    }
    public Object pop(){
        Object val= list.findLastElement();
        list.remove(list.findLastElement());
        return  val;
    }

    @Override
    public String toString() {
        return "CustomStackUsingLinkedList{" +
                "list=" + list.toString() +
                '}';
    }

    public Object top(){return list.findLastElement();}
    static void main(String args[]){
        CustomStackUsingLinkedList customStackUsingLinkedList = new CustomStackUsingLinkedList();
        customStackUsingLinkedList.push(10);
        customStackUsingLinkedList.push(20);
        customStackUsingLinkedList.push(30);
        customStackUsingLinkedList.push(40);
        customStackUsingLinkedList.push(50);
        customStackUsingLinkedList.push(60);
        System.out.println(customStackUsingLinkedList);
        System.out.println(customStackUsingLinkedList.pop());
        System.out.println(customStackUsingLinkedList);
        System.out.println(customStackUsingLinkedList.top());
        System.out.println(customStackUsingLinkedList);

    }
}
