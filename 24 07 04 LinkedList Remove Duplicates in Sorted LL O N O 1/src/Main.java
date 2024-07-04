import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
class RemoveDuplicatesFromSortedList{
    public static ListNode deleteDuplicates(ListNode head){
        if(head == null){return head;}
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }

        }
        return head;
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode createLinkedList(int[] elements){
        if(elements.length == 0){return null;}
        ListNode head = new ListNode(elements[0]);
        ListNode current = head;
        for(int i = 1; i < elements.length; i++){
            current.next = new ListNode(elements[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){return;}
        int[] elements = new int[n];
        for(int i = 0; i < n; i++){elements[i] = sc.nextInt();}
        ListNode head = createLinkedList(elements);
        printList(head);
        head = deleteDuplicates(head);
        printList(head);
    }

}