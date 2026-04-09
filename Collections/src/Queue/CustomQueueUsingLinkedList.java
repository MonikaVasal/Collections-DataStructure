package Queue;

import LinkedList.Singly.SinglyLinkedListAtEnd;


class CustomQueueUsingLinkedList {
    SinglyLinkedListAtEnd list;

    CustomQueueUsingLinkedList() {
        list = new SinglyLinkedListAtEnd();
    }

    public void offer(Object val) {
        list.add(val);
    }

    public Object poll() {
        Object val = list.findFirstElement();
        list.remove(list.findFirstElement());
        return val;
    }

    @Override
    public String toString() {
        return "CustomQueueUsingLinkedList{" +
                "list=" + list.toString() +
                '}';
    }

    public Object peek() {
        return list.findFirstElement();
    }


    static void main(String args[]) {
        CustomQueueUsingLinkedList customStackUsingLinkedList = new CustomQueueUsingLinkedList();
        customStackUsingLinkedList.offer(10);
        customStackUsingLinkedList.offer(20);
        customStackUsingLinkedList.offer(30);
        customStackUsingLinkedList.offer(40);
        customStackUsingLinkedList.offer(50);
        customStackUsingLinkedList.offer(60);
        System.out.println(customStackUsingLinkedList);
        System.out.println(customStackUsingLinkedList.poll());
        System.out.println(customStackUsingLinkedList.peek());
        System.out.println(customStackUsingLinkedList);
    }
}