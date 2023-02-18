import java.util.Scanner;

public class takingInputFromconsol {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner a=new Scanner(System.in);
        int age=a.nextInt();
        System.out.println("Age is "+age);
        System.out.println("Enter the ,mark");
        double dbl=a.nextDouble();
        System.out.println("Mark is "+dbl);
        System.out.println("Enter the Name");
        String str=a.next();
        System.out.println("Name is "+str);

    }
}
