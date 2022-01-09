import java.util.*;

public class PrintElementLinkedList {

    static class SinglyLinkedListNode{
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodedata){
            this.data = nodedata;
            this.next = null;
        }
    }

    static class SinglyLinkedList{
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList(){
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodedata){
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(nodedata);

            if(head == null){
                this.head = newNode;
            }else {
               newNode.next = this.head;
               this.head = newNode;
            }

        }

        public void printNode(SinglyLinkedListNode head){
            while(head.next != null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }


    public static void main(String []args){
        System.out.println("haha");

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertNode(2);
        list.insertNode(1);
        list.insertNode(10);
        list.insertNode(9);

        list.printNode(list.head);

    }




}