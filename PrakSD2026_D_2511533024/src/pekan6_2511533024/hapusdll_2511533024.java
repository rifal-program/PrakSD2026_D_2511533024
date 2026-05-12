package pekan6_2511533024;

public class hapusdll_2511533024 {

    public static nodedll_2511533024 delhead_3024(nodedll_2511533024 head_3024) {
        if (head_3024 == null) {
            return null;
        }

        head_3024 = head_3024.next;

        if (head_3024 != null) {
            head_3024.prev = null;
        }

        return head_3024;
    }

    public static nodedll_2511533024 dellast_3024(nodedll_2511533024 head_3024) {
        if (head_3024 == null) {
            return null;
        }

        if (head_3024.next == null) {
            return null;
        }

        nodedll_2511533024 curr_3024 = head_3024;

        while (curr_3024.next != null) {
            curr_3024 = curr_3024.next;
        }

        if (curr_3024.prev != null) {
            curr_3024.prev.next = null;
        }

        return head_3024;
    }

    public static nodedll_2511533024 delpos_3024(nodedll_2511533024 head_3024, int pos_3024) {
        if (head_3024 == null || pos_3024 <= 0) {
            return head_3024;
        }

        nodedll_2511533024 curr_3024 = head_3024;

        // Jika yang dihapus adalah posisi 1 (head)
        if (pos_3024 == 1) {
            return delhead_3024(head_3024);
        }

        for (int i_3024 = 1; curr_3024 != null && i_3024 < pos_3024; i_3024++) {
            curr_3024 = curr_3024.next;
        }

        if (curr_3024 == null) {
            return head_3024;
        }

        if (curr_3024.prev != null) {
            curr_3024.prev.next = curr_3024.next;
        }

        if (curr_3024.next != null) {
            curr_3024.next.prev = curr_3024.prev;
        }

        return head_3024;
    }

    public static void printList_3024(nodedll_2511533024 head_3024) {
        nodedll_2511533024 curr_3024 = head_3024;

        while (curr_3024 != null) {
            System.out.print(curr_3024.data + " ");
            curr_3024 = curr_3024.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        nodedll_2511533024 head_3024 = new nodedll_2511533024(1);

        head_3024.next = new nodedll_2511533024(2);
        head_3024.next.prev = head_3024;

        head_3024.next.next = new nodedll_2511533024(3);
        head_3024.next.next.prev = head_3024.next;

        head_3024.next.next.next = new nodedll_2511533024(4);
        head_3024.next.next.next.prev = head_3024.next.next;

        head_3024.next.next.next.next = new nodedll_2511533024(5);
        head_3024.next.next.next.next.prev = head_3024.next.next.next;

        System.out.print("DLL awal: ");
        printList_3024(head_3024);
        
        System.out.print("setelah head dihapus: ");
        head_3024 = delhead_3024(head_3024);
        printList_3024(head_3024);

        System.out.print("Setelah node terakhir dihapus: ");
        head_3024 = dellast_3024(head_3024);
        printList_3024(head_3024);

        System.out.print("Setelah menghapus node ke-2: ");
        head_3024 = delpos_3024(head_3024, 2);
        printList_3024(head_3024);
    }
}