import java.util.Arrays;

/**************************************************************
 * Name        : Array-based LinkedList Driver
 * Author      : Rumbi Chinhamhora
 * Created     : 2/20/2021
 * Course      : CIS 152 Data Structures
 * Version     : 1.0
 * OS          : Windows 10
 * Language	   : Java
 * Copyright   : This is my own original work based on
 *               specifications issued by our instructor
 * Description : This program overall description here
 *               Input:  list and describe
 *               Output: list and describe
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or
 * unmodified. I have not given other fellow student(s) access to
 * my program.
 ***************************************************************/

public class LinkedListDriver {
    public static void main( String[] args ) {
        new LinkedListDriver().go();
    }

    private void go() {
        LinkList<Double> ll = new LinkList<>();
        try {
            for ( double d : Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5) ) {
                ll.addLast(d);
            }
            System.out.println("Added 5 items: ");
            System.out.println(ll);

            System.out.println("Adding item at position 2");
            ll.add(2, 2.5);
            System.out.println(2.5 + " added.");
            System.out.println("Size is " + ll.size());
            System.out.println("List is now:");
            System.out.println(ll);

            System.out.println("Testing removals");
            System.out.println("First item is " + ll.peekFirst());
            System.out.println("First item removed: " + ll.removeFirst());
            System.out.println("List is now:");
            System.out.println(ll);

            System.out.println("Item at index 2 removed: " + ll.remove(2));
            System.out.println("List is now:");
            System.out.println(ll);
        }
        catch (ListFullException | ListEmptyException e) {
            e.printStackTrace();
        }

        System.out.println("Testing exceptions");

        try {
            ll = new LinkList<>(2);
            ll.addLast(2.0);
            ll.add(0, 1.0);
            ll.addLast(3.0);
        } catch (ListFullException e) {
            System.out.println("List Full Exception on third add.");
        }
        System.out.println("List is now:\n" + ll);

        try {
            System.out.println("Removed " + ll.removeFirst());
            System.out.println("Removed " + ll.removeFirst());
            System.out.println("Removed " + ll.removeFirst());
        } catch (ListEmptyException e) {
            System.out.println("List Empty Exception on 3rd remove operation.");
        }
        System.out.println("List is now:");
    }
}
