//Immutable String in  java
// Syntax
// String str=new String("javastring"); || String str="javastring"; || char ch[]={'A','b','c'}; now create the String str=new String(ch); like that ways we can create the Strings
//Whenever you created the string without using new keyword like String s1="abc"; for that memory will be allocated inside the scp{String constant pool} within the heap area
//Whenever you use new key word then memory will be created outside the SCP(String constant pool ) but inside the Heap area but JVM will keep one copy of this String for that no one is referring as object
// without using new keyword duplicate are not permitted || allowed
// Using New keyword  duplicate are  permitted || allowed
public class ImmutableString {
    public static void main(String[] args) {
        String str1="shekhar";
        String str2="shekhar";
        System.out.println(str1==str2);// It will return true because of this memory is allocated in string constant pool where both reference variable is referring for same variable
        String str3=new String("shekhar");
        String str4=new String("shekhar");
        System.out.println(str3==str4);// It will return true because of this memory is allocated outside  string constant pool where both reference variable is referring for deference  variable
    }

}
