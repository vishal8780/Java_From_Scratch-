import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Api1 {
    public static void main(String[] args) {
//        List list= Arrays.asList(7,9,11,10,5,6,8,3,4);
//        Stream<Integer> stream=list.stream();
//
//        Stream<Integer> stream1=stream.sorted();
//
//        Stream<Integer> stream2=stream1.filter(n-> n%2==0);
//
//        Stream<Integer> stream3=stream2.map(n-> n/2);
//        stream3.forEach(n-> System.out.println(n));
        List list=new ArrayList<Integer>();
        list.add(10);
        list.add(9);
        list.add(0);
        list.add(5);
        list.add(2);
        Stream<Integer> stream=list.stream();
        Stream<Integer> stream1=stream.sorted();
     Stream<Integer>  stream2=stream1.filter(n-> n%2==0);
     stream2.forEach(n-> System.out.println(n));



    }
}
