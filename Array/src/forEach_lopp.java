public class forEach_lopp {
    public static void main(String[] args) {
        int arr[][]={
                {3,4,5,6},
                {4,8,9,0},
                {91,8,6,90}
        };

        for(int n[] :arr)
        {
            for (int k :n){
                System.out.print(k+ "   ");
            }
            System.out.println();
        }





    }
}
