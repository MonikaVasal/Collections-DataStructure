package LinkedList.Singly;

import java.util.StringJoiner;

public class SinglyLinkedListAtFirst {
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
        Node node=new Node(value);
        if(head==null && tail==null){
            head=node;
            tail=node;
        }
        else{
            Node temp=head;
            head=node;
            head.next=temp;
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

    public Object remove(Object val){
        Node temp=head;
        if(head==null){
            return "Linked list is empty";
        }
        else if(head.data==val){
            Object value=head.data;
            head=head.next;
            return value;
        }
        else {
            while (temp.next!= null) {
                if(temp.next.data==val){
                    Object value=temp.next.data;
                    temp.next=temp.next.next;

                    return value;
                }
                temp=temp.next;
            }
        }
        return false;
    }
    public static void main(String args[]){
        SinglyLinkedListAtFirst singlyLinkedListAtEnd = new SinglyLinkedListAtFirst();
        singlyLinkedListAtEnd.add(10);
        singlyLinkedListAtEnd.add(20);
        singlyLinkedListAtEnd.add(30);
        singlyLinkedListAtEnd.add(40);
        singlyLinkedListAtEnd.add(50);
        singlyLinkedListAtEnd.add(60);
        singlyLinkedListAtEnd.add(70);
        System.out.println(singlyLinkedListAtEnd);
    }
}
