public class Task3 {

    /**
     * დაზუსტებული არაა ახალი უნდა შევქმნათ თუ ძველი ლისტი უნდა შევცვალოთ, მაგრამ ჩემთვის ცხადია რომ
     * ამ ამოცანის ამოხსნა ცოდვა იქნებოდა წრფივი დროისა და მუდმივი სივრცის გამოყენების გარეშე.
     * ვიყენებ while loop და ვანაცვლებ pointer-ებს.
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    /**
     * ვტესტავ კენტი სიგრძის, ლუწი სიგრძის, ერთ ელემენტიან და null ინპუტებზე
     */
    public static void main(String[] args) {
        ListNode l1 = ListNode.ofRange(1, 6);
        System.out.println(l1); // 1->2->3->4->5->null
        System.out.println(reverseList(l1)); // 5->4->3->2->1->null

        ListNode l2 = ListNode.ofRange(1, 5);
        System.out.println(l2); // 1 -> 2 -> 3 -> 4 -> null
        System.out.println(reverseList(l2)); // 4 -> 3 -> 2 -> 1 -> null

        ListNode l3 = ListNode.ofRange(1, 1);
        System.out.println(l3); // 1 -> null
        System.out.println(reverseList(l3)); // 1 -> null

        ListNode l4 = null;
        System.out.println(l4); // null
        System.out.println(reverseList(l4)); // null
    }


    /**
     * მარტივი singly linked list კლასი
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        /**
         * შექმნის მარტივი ფუნქცია, რომელიც გატესტვაში გამოგვადგება
         */
        static ListNode ofRange(int from, int toExclusive) {
            ListNode curr = new ListNode(from);
            ListNode head = curr;
            while (++from < toExclusive) {
                curr.next = new ListNode(from);
                curr = curr.next;
            }
            return head;
        }


        // ასევე გასატესტად
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode curr = this;
            while (curr != null) {
                sb.append(curr.val).append(" -> ");
                curr = curr.next;
            }
            sb.append("null");
            return sb.toString();
        }
    }

}
