public class removeDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode firstNode = head;
        int firstValue = 0;
        try {
            firstValue = head.val;
        } catch (Exception e) {
            return  head;
        }
        ListNode secondNode = null;
        int secondValue = 0;
        try {
            secondNode = head.next;
            secondValue = secondNode.val;

        } catch (Exception e) {
            return head;
        }

        while (!(secondNode == null)) {
            if (firstValue == secondValue) {
                try {
                    firstNode.next = secondNode.next;
                    secondNode.next = null;
                    secondNode = firstNode.next;
                    firstValue = firstNode.val;
                    secondValue = secondNode.val;
                } catch (Exception e) {
                    return head;
                }
                continue;
            }
            firstNode = firstNode.next;
            firstValue = firstNode.val;
            try {
                secondNode = secondNode.next;
                secondValue = secondNode.val;
            } catch (Exception e) {
                return head;
            }
        }
        return head;
    }

    public static void printResult (ListNode head) {
        ListNode current = head;
        String result = "";
        while (!((current.next) == null)) {
            result = result + " " + current.val;
            current = current.next;
            if (current.next == null) {
                result = result + " " + current.val;
            }
        }
        System.out.println(result);
    }
}
