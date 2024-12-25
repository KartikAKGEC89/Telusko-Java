package DSA.LinkedList;

import java.util.LinkedList;

public class PrebuiltLL {
    public static void main(String[] args) {
        LinkedList<Integer> L = new LinkedList<>();
        L.add(0);
        L.addAll(1, L);
        L.iterator();
    }
}
