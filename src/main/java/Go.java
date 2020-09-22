public class Go {
    public static void main(String[] args) {
        System.out.println(C.x);
    }
}

class A{
    static {
        System.out.println("A");
    }
}
class B extends A{
    public static int x = 5;
    static {
        System.out.println("B");
    }
}
class C extends B{
    static {
        System.out.println("C");
    }
}
