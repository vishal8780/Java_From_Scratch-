import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        System.out.println(arrayList);
        System.out.println("<======================================>");
        ArrayList arrayList1=new ArrayList();
        arrayList1.add("Hello collection");
        arrayList1.add("How are you today");
        arrayList1.add("Everything is good");
        arrayList1.add(1.1);
        System.out.println(arrayList1);
        System.out.println("<======================================>");
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);
        //Based on the index we can perform the insertion of collection
        System.out.println("<======================================>");
        arrayList1.add(3,"Element got changed ");
        System.out.println(arrayList1);
// so here one change like whatever the element you inserted at that index that element got shifted to the next index
//[Hello collection, How are you today, Everything is good, 1.1, 100, 200, 300, 400, 500
// [Hello collection, How are you today, Everything is good, Element got changed , 1.1, 100, 200, 300, 400, 500]
// Look at index but this  approach in  not recommended
        // & duplicate element are allowed here
        arrayList.add(500);
        System.out.println(arrayList);



    }
}
