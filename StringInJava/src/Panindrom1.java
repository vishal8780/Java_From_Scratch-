public class Panindrom1 {
    public static void main(String[] args) {
        String s="shekhar";
        String s1="";
        for (int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);

        }
        if (s1.equals(s))
        {
            System.out.println("Palindrom");

        }
        else
        {
            System.out.println("Nt ");
        }
    }
}
