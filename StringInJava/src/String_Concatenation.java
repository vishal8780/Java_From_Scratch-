// String concatenation is a technique where connecting two or more string together in a new created string is known as string concatenation various approach to concatenate string in  java
// Using + plus operator
//String.concat() method

public class String_Concatenation {
    public static void main(String[] args)
    {

        //Step==>1
//        String s1=new String("Karma");
//        s1=s1.concat(" will  Return");
//
//        System.out.println(s1);

        //Step ==>2

//        String s1="New String ";// Created this string inside the SCP in Heap memory
//        String s2=s1.concat(" is next level");// this string is created inside the Heap memory & kept copy inside the SCP Without referring any object
//        String s3=new String("you should try ");// outside the SCP and referring a new obj as s3
//        s3=s3.concat("AGain and again");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        //Step==>3 using + operator
        String s1="Hey";
        String s2="Hey " + "Im using  java";
        String s4="Hey " + "Im using  java" + "for learning purpose";
        String s3=s1+s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}
