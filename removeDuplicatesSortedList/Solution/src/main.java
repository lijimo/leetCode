public class main {

    public static void main(String[] args) {

        // input is [1,1,2]
        ListNode second = new ListNode(2);
        ListNode first = new ListNode(1, second);
        ListNode head = new ListNode(1, first);

        // expected is [1, 2]
        ListNode result = removeDuplicates.deleteDuplicates(head);
        removeDuplicates.printResult(result);


    }
}
