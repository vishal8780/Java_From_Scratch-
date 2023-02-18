class  cal{
    public  int add(int n1,int n2)
    {
        int result=n1+n2;
        return result;
    }
    public  int add(int n1,int n2,int n3)
    {
        int result=n1+n2+n3;
        return result;
    }

}
public class Main {
    public static void main(String[] args)
    {
        cal obj=new cal();
        int Result1=obj.add(3,6);
        int Result2=obj.add(5,7,9);
        System.out.println(Result1);
        System.out.println(Result2);


    }
}