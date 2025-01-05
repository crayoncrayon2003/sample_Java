import java.util.HashSet;
import java.util.Set;

class set {
    public static void main(String[] args) {
        System.out.println("----- set -----");
        Set<String> set = new HashSet<>();

        set.add("Red");
        set.add("Green");
        set.add("Green");
        set.add("Blue");

        System.out.println("----- before -----");
        for (String item : set) {
            System.out.println(item);
        }

        set.remove("Green");

        System.out.println("----- after -----");
        for (String item : set) {
            System.out.println(item);
        }

    }
}
