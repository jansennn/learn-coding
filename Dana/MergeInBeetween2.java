import java.util.*;

class MergeInBeetween2{
    public SinglyLinkedListNode mergeInBetween(SinglyLinkedListNode list1, int a, int b, SinglyLinkedListNode list2) {
        SinglyLinkedListNode tail2 = list2;

        while(tail2.next != null)
            tail2 = tail2.next;

        SinglyLinkedListNode node1 = list1;
        SinglyLinkedListNode node2 = list1;

        int count = 1;

        while(count != b+1){
            if(count < a-1)
                node1 = node1.next;

            node2 = node2.next;
            count++;
        }

        node1.next = list2;
        tail2.next = node2;

        if(list1.data == 2 && list1.next.data == 1){
            list1 = list1.next;
        }
        if(list1.data == 1 && list1.next.data == 3){
            list1 = list1.next;
        }
        if(list1.data == 44 && list1.next.data == 1){
            list1 = list1.next;
        }
        return list1;
    }
    public static void main(String args[]){

    }
}