import java.util.ArrayList;
import java.util.List;

public class infiniteloop {
    public static void main(String[] args) {
        try{
            System.out.println("Hello" + " "+ 1/0);
        }
        catch (ArithmeticException e){
            System.out.println("world");

        }

    }
}
