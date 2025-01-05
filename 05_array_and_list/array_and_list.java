
import java.util.ArrayList;
import java.util.List;

class array_and_list {
    public static void main(String[] args) {
        System.out.println("----- array -----");
        String[] array = {"Red", "Green", "Blue"};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        for (int idx = 0; idx < array.length; idx++){
            System.out.println(array[idx]);
        }

        System.out.println("----- list -----");
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Green");
        list.add("Blue");

        System.out.println("----- before -----");
        for (String item : list) {
            System.out.println(item);
        }

        list.remove("Green");

        System.out.println("----- after -----");
        for (String item : list) {
            System.out.println(item);
        }

    }
}