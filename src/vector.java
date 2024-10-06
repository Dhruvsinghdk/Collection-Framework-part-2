import java.util.*;

public class vector {
    public static void main(String[] args) {
        Vector v = new Vector(10,1);
        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
//        for (int i = 0; i <= 10; i++) {
//            v.addElement(i);
//        }
        v.add(12);
        v.add(12);
        v.add(12);v.add(12);

        System.out.println(v);
        System.out.println(v.capacity());
    }
}
