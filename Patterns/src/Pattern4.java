public class Pattern4 {
    public static void main(String[] args) {
        double n=7;
        for (double i =0;i<n;i++)
        {
            for (double j=0;j<n;j++)
            {
                if(i==0 || j==(n-1)/2){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
