public class MainThread {
    public static void main(String[] args) {
     Double d1 = Double.valueOf(0);
        Double d2 = Double.valueOf(0);
        double d3 = Double.valueOf(0);
        boolean b12=d1==d2;
        boolean b23=d2==d3;
        boolean b31=d3==d1;
        System.out.println(b12 + " " + b23 + " " +b31);



    }
}
