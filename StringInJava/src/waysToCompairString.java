public class waysToCompairString {
    // comparing two String using == operator ==> It compare the reference of object
    //comparing two String using .equal() ==> It compare content of two object
    // Both will return the output in  boolean as true or false
    // Lets check with the code

    public static void main(String[] args)
    {
//        String str1="Hi Java";
//        String str2=new String("Hi Java");
//        System.out.println(str1==str2);
//// It will give result as false because we are comparing the string as reference variable where one which using new keyword created inside the SCP and another is outside that
//        System.out.println(str1.equals(str2));
//        //It will give the result as  true because it's comparing the content of the string
        String str1="Hello java";
        String str2="Hello java";
        String str3="Hello JaVa";
        System.out.println(str1==str2); // for str1 and str2 same reference is created  in SCP
        System.out.println(str1==str3); // but here reference is different in SCP
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }


}
