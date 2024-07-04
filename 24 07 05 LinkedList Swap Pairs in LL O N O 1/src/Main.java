import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

class SwapNodePair{
    public static ListNode swapPairs(ListNode head){
        ListNode dumy = new ListNode(0);
        dumy.next = head;
        ListNode current = dumy;
        while(current.next != null && current.next.next != null){
            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            second.next = first;
            current.next = second;
            current = first;
        }
        return dumy.next;
    }
    public static ListNode readLinkedList(Scanner scanner, int n){
        ListNode dumy = new ListNode(0);
        ListNode tail = dumy;
        for(int i = 0; i< n; i++){
            int value = scanner.nextInt();
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        return dumy.next;
    }
    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = readLinkedList(sc, n);
        ListNode newHead = swapPairs(head);
        printLinkedList(newHead);
        sc.close();
    }

}