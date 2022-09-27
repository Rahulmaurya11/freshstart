public class recursion {
    public static void main(String[] args) {
       recur(1);
    }
    public static void recur(int n ){
        System.out.println(n);
        recur1(2);
    }
    public static void recur1(int n ){
        System.out.println(n);
        recur2(3);
    }
    public static void recur2(int n ){
        System.out.println(n);
        recur3(4);
    }
    public static void recur3(int n ){
        System.out.println(n);
        recur4(5);
    }
    public static void recur4(int n ){
        System.out.println(n);
    }


}
