import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                d=sc.nextInt();
        System.out.println(":Enter the number ");

        if (a>b && a>c && a>d)
        {
            System.out.println("A greter value" +a);
        }
        else if (b>a && b>c && b>d)
        {
            System.out.println("B grter  value=="+b);
        } else if (c>a&&c>b&&c>d)
        {
            System.out.println("C is gretrt =="+c);
        }
        else {
            System.out.println("D is greater===>" +d);
        }

    }
}
