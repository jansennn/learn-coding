import java.util.*;

class Merge{

    static class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data){
            this.data = data;
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

        public void insertNode(int nodeData){
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(nodeData);
            newNode.next = null;

            if (this.head == null) {
                this.head = newNode;
            } else {
//                this.tail.next = node;
                SinglyLinkedListNode node = this.head;
                while(node.next != null){
                    node = node.next;
                }
                node.next = newNode;
            }

//            this.tail = node;
        }

        public void mergeInBeetween(SinglyLinkedListNode list1, SinglyLinkedListNode list2, int a, int b){
            int count1 = 1;
            int count2 = -1;
            SinglyLinkedListNode temp = list1;
            while(++count2 != b){
                temp = temp.next;
            }

            while(++count1 != a){
                list1 = list1.next;
            }
            list1.next = list2;

            while(list1.next != null){
                list1 = list1.next;
            }
            list1.next = temp;

        }

        public SinglyLinkedListNode merge(SinglyLinkedListNode list1, SinglyLinkedListNode list2, int a, int b){
            SinglyLinkedListNode prev = null;
            SinglyLinkedListNode prev2 = null;
            SinglyLinkedListNode aList = list1;
            SinglyLinkedListNode bList = aList;
            int aVal = 1;
            int bVal = 1;
            SinglyLinkedListNode tailBList = list2;
            while(aVal != a){
                prev = aList;
                aList = aList.next;
                aVal++;
            }
            while(bVal != b){
                bList = bList.next;
                bVal++;
            }
            prev.next = list2;
            while(tailBList != null) {
                prev = tailBList;
                tailBList = tailBList.next;
            }
            prev.next = bList.next;
            return aList;
        }
    }

    static void printSinglyLinkedList(SinglyLinkedListNode node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String args[]){
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        SinglyLinkedList linkedList2 = new SinglyLinkedList();

        linkedList1.insertNode(1);
        linkedList1.insertNode(2);
        linkedList1.insertNode(3);
        linkedList1.insertNode(4);
        linkedList1.insertNode(5);

        linkedList2.insertNode(6);
        linkedList2.insertNode(7);
        linkedList2.insertNode(8);
        linkedList2.insertNode(9);


        linkedList1.merge(linkedList1.head, linkedList2.head, 2, 3);
        /* Print Linked list*/
        printSinglyLinkedList(linkedList1.head);
    }
}