import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<=n-i+1;j++)
          {
              System.out.print(j+"");
          }
          System.out.println();
      }


    }
}
