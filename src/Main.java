import java.util.*;

public class Main {
    public static void main(String[] args) {
         LinkedList l = new LinkedList();
         l.add(10);
         l.add("aabb");
         l.add("java");
         l.add(20);
         l.addFirst("Amit");
         l.addLast(30);

         l.set(2,5060);
        System.out.println(l);

        l.removeFirst();
        l.removeLast();
        System.out.println(l);

    }
}