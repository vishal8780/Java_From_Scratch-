import java.util.Scanner;

public class Reverce_String {
    public static void main(String[] args) {
//       Method First Reverse  the string without any space
//        Scanner sc=new Scanner(System.in);
//        String str1=sc.nextLine();
//        String str2="";
//        for (int i = str1.length()-1; i >= 0; i--) {
//            str2 = str2 + str1.charAt(i);
//        }
//        System.out.println(str2);


        //Method 2  Reversing the String like which have some spaces  by using split() method like AUTOCUT VOLTAGE, and it will print like VOLTAGE AUTO-CUT
//
//        String str1="AUTOCUT VOLTAGE";
//        String str2="";
//         String str3[]=str1.split(" ");
//         for (int i=str3.length-1;i>=0;i--)
//         {
//             str2=str2+str3[i]+" ";
//         }
//        System.out.println(str2);

        // Method 3 Reversing the String with spaces

        String str1="AUTOCUT VOLTAGE";
        String str2="";
        String str3[]=str1.split(" ");
       for(String elem : str3)
       {
          for (int i=elem.length()-1;i>=0;i--)
           {
               str2=str2+elem.charAt(i);

           }
          str2=str2+" ";
       }
        System.out.println(str2);

    }
}
