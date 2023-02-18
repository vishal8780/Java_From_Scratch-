public class TwodArray
{
    public static void main(String[] args) {
//        int arr[][];
//        arr[0][0]=9;
//        arr[0][1]=8;
//        arr[1][0]=7;
//        arr[1][1]=6;
//        arr[2][0]=5;
//        arr[2][1]=4;
       int  arr[][]=
               {
                {3,2}, {4,6}, {8,9}
               };
        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
