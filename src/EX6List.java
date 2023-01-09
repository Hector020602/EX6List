import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EX6List {

    public static void main(String[] args) {
        String[] arr = {"a", "c", "e", "d", "b"};
        sort(arr);
        shuffle(arr);
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
    public static void sort(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
    }

    public static void shuffle(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
    }



}
