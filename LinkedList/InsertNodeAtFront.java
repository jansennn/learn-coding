import java.util.*;

class InsertNodeAtFront{
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }


    public static InsertNodeAtFront insert(InsertNodeAtFront list, int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null){
            list.head = newNode;
        } else {
            Node node = list.head;
            while(node.next != null){
                node = node.next;
            }

            node.next = newNode;
        }

        return list;

    }

    public static void printList(InsertNodeAtFront list){
        Node currNode = list.head;

        System.out.println("Linked list : ");

        while(currNode != null){
            System.out.println(currNode.data + " ");

            currNode = currNode.next;
        }
    }





    public static void main(String[] args){
        InsertNodeAtFront list = new InsertNodeAtFront();

        list = insert(list, 2);
        list = insert(list, 3);


        printList(list);
    }
}
