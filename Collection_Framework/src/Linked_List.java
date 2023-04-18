import com.sun.jdi.connect.spi.TransportService;

import java.util.*;

public class Linked_List {
    public static void main(String[] args)
    {
        LinkedList Ll=new LinkedList();
        Ll.add(100);
        Ll.add(200);
        Ll.add(300);
        Ll.add(400);
        System.out.println(Ll);

        LinkedList Ll2=new LinkedList();
        Ll2.add("HI");
        Ll2.add("HEllo");
        System.out.println(Ll2);

        LinkedList LL2=new LinkedList();
        LL2.add(100);
        LL2.add("Book");
        LL2.add(125);
        LL2.add("Semi");
        LL2.add("Syatan noob hoti sirf ldkiyo ko kt deti ");
        System.out.println(LL2);
        LL2.addFirst("Hi Hello ");
        LL2.addLast("bye");
        System.out.println(LL2);
// Adding the element using the index
        LL2.add(2,"Sheishere");
        System.out.println(LL2);
        System.out.println(LL2.peek());
        System.out.println(LL2.poll());// this method also delete the data from  the list\
        System.out.println(LL2);


    }
}
