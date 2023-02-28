import java.util.Locale;

public class Imp_String_Inbuild_Method {
    public static void main(String[] args) {
        String str="My name is java  and im doing gread in my field ";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.substring(5,20));// It will giev the op of string in index within 5 to 20
        System.out.println(str.charAt(8));
        System.out.println(str.indexOf("i")); //it will return of output as 8 becoz it will return only when it get index at first place like what if it will get the index at last or middel for that also we have one method like
        System.out.println(str.lastIndexOf("i"));
        System.out.println(str.replace("gread","Great"));
       String str1="I" + "like" + "Java";
        System.out.println(str1);

    }
}
