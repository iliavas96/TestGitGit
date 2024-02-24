import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class UU {
    private int i =5;

    public void addInt () {
        System.out.println("2++=2");
        for (int i = 0; i<125; i++) {
            System.out.println(this.i+i);
        }
    }

    public static void main(String[] args) {
        UU uu = new UU();
        uu.addInt();

        TreeMap<Integer, String> number_case = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("_________________________");

        number_case.put(77, "Kuka");
        number_case.put(17, "Lupa");
        number_case.put(27, "Kola");
        number_case.put(707, "Rola");

        number_case.entrySet().stream()
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }

}
