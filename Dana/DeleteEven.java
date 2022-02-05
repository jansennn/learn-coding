import java.util.*;

class DeleteEven{
    static class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int newData){
            this.data = newData;
            this.next = null;
        }
    }

    static class SinglyLinkedList{
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int newData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(newData);

            if(this.head == null){
                this.head = node;
            }else{
                this.tail.next = node;
            }
            this.tail = node;
        }

        public void printLinkedList(SinglyLinkedListNode head){
            while (head != null){
                System.out.println(head.data);
                head = head.next;
            }
        }

    }

    public static void deleteEven(SinglyLinkedListNode listHead){
        SinglyLinkedListNode listnode = listHead;
        SinglyLinkedListNode current = listnode;
        SinglyLinkedListNode prev = listnode;

        current = current.next;
        while(current != null){
            if(current.data % 2 == 0){

            }
            prev = current;
            current = current.next;
        }
    }

    public static SinglyLinkedListNode delete(SinglyLinkedListNode listHead){
        SinglyLinkedListNode curr = listHead;
        SinglyLinkedListNode prev = null;

        if(listHead==null) return listHead;

        while(curr != null){
            if(curr.data %2 == 0){
                if(prev == null){
                    SinglyLinkedListNode node = curr.next;
                    curr.next = prev;
                    prev = node;
                    curr = prev.next;
                    listHead = prev;
                }
                else{
                    SinglyLinkedListNode node = curr.next;
                    prev.next = node;
                    curr.next = node;
                    curr = node;
                }
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }

        return listHead;
    }
    public static void main(String args[]){
        SinglyLinkedList ls = new SinglyLinkedList();

        ls.insertNode(1);
        ls.insertNode(2);
        ls.insertNode(3);
        ls.insertNode(4);
        ls.insertNode(6);
        ls.insertNode(7);

        delete(ls.head);
        ls.printLinkedList(ls.head);
    }
}