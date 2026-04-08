package LinkedList.Singly;

import java.util.StringJoiner;

public class SinglyLinkedListAtEnd {
    class Node{
        Object data;
        Node next=null;
        Node(Object data){
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    public void add(Object value){
        Node node = new Node(value);
        if(head==null && tail==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }

    @Override
    public String toString() {
        Node temp=head;
        StringJoiner stringJoiner = new StringJoiner(",","{","}");
        while(temp!=null){
            stringJoiner.add(temp.data.toString());
            temp=temp.next;
        }
        return stringJoiner.toString();
    }
    static void main(String args[]){
        SinglyLinkedListAtEnd singlyLinkedList = new SinglyLinkedListAtEnd();
        singlyLinkedList.add(10);
        singlyLinkedList.add(20);
        singlyLinkedList.add(30);
        singlyLinkedList.add(40);
        singlyLinkedList.add(50);
        singlyLinkedList.add(60);
        singlyLinkedList.add("monika");
        System.out.println(singlyLinkedList);
    }
}
