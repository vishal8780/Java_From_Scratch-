 interface AddValue {
    int add(int a, int b);
}
 class Addition{
    public static void main(String[] args) {
        AddValue ad=(a,b)->(a+b);
        System.out.println(ad.add(10,20));
        AddValue ad1=(int a,int b)->(a+b);
        System.out.println(ad1.add(100,200));
    }
}
