import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Api {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(2,3,5,6,7,8,9,10);
//        Stream<Integer> streamData=list.stream();
//        streamData.forEach(i -> System.out.println(i) );
            List<Integer> list=Arrays.asList(9,8,7,6,5,4,3);
            Stream<Integer> stream1=list.stream();
          long count= stream1.count();
        //System.out.println(count);
        //
        Stream<Integer> stream2=list.stream();
        //stream2.forEach(integer -> System.out.print(" "+integer));
        //
        Stream<Integer> stream3=list.stream();
      Stream<Integer> sorted= stream3.sorted();
      //sorted.forEach(integer -> System.out.println(integer));
     Stream<Integer>  mapsteam=sorted.map(n->n*2);
     mapsteam.forEach(integer -> System.out.println(integer));
    }
}
