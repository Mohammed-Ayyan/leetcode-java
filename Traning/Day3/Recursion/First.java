package Day3.Recursion;

public class First {
    public static void recur(int i) {
        if (i==11) {
            System.out.println("HEllow");
            return;
        }
        System.out.println(i);
        recur(i+1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        recur(1);
    }
}
