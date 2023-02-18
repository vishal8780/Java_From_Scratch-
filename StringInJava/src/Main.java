//String in java

// In java String is called as collection of  character or series of character which can be enclosed within " "
//OR collection of any character like ==> "abc" "Vishal" "@#%&*()" anything which are within this double code " " treated as string
// a String is a class (inbuilt class) in java because it is start with the S capital letter
// String is treated as  object in  java that allocate the memory inside the  heap area

//Types of String in java
// There are two types of String in java
// 1==>Immutable( Non-Changeable) we have to use the class as String Like==> String str="ABCD";Immutable
// 2==>Mutable(Changeable)==> such a values whose values can be change once it created for that we have to use a claas as StringBuffer || StringBuilder class
//StringBuilder str1=new StringBuilder("ABCD");
public class Main {
    public static void main(String[] args)
    {
        String str= "Hello sir ";//immutable string
        str.concat("How are you");// now here you can see it will not change the values
        System.out.println(str);
        StringBuilder str1=new StringBuilder("Hi Sir" );//Mutable String
        str1.append("how you are doing sir ");// Now see its change the existing value because of it mutable means it can change
        System.out.println(str1);


    }
}