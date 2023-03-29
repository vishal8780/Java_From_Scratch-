public class Palindrom {
    public static void main(String[] args) {

//       for (int i=str1.length()-1;i>=0;i--)
//       {
//           str2 = str2 + str1.charAt(i);
//       }
//       if (str2.equals(str1))
//       {
//           System.out.println("Palidorm number");
//       }
//       else {
//           System.out.println("Not a palindrom number");
//       }


        String str1="MAhesh KOli aayega kaam krne  5500";
        String str2="";

        for (int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        System.out.println(str2);

    }
}
