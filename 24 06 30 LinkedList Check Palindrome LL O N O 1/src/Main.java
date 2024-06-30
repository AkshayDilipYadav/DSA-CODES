import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class PalindromeLinkedList {
    public static ListNode createLinkedList() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            sc.close();
            return null;
        }
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        sc.close();
        return head;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;
        ListNode tempSecondHalf = secondHalf;
        boolean isPalindrome = true;
        while (tempSecondHalf != null) {
            if (firstHalf.val != tempSecondHalf.val) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecondHalf = tempSecondHalf.next;
        }
        reverseList(secondHalf); // Restore the list to its original state
        return isPalindrome;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = createLinkedList();
        if (head == null) {
            System.out.print("No");
            return;
        }
        boolean result = isPalindrome(head);
        if (result) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}