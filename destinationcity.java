import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class destinationcity {
    // 1436. Destination City
    public static void main(String[] args) {
        String[][] cities = { { "B", "C" }, { "D", "B" }, { "C", "A" } };
        List<List<String>> citi = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < cities.length; i++) {
            List<String> p = new ArrayList<>();
            map.put(cities[i][0], cities[i][1]);
            p.add(cities[i][0]);
            p.add(cities[i][1]);
            citi.add(p);

        }
        String ans = "";
        for (int i = 0; i < cities.length; i++) {
            if (!map.containsKey(cities[i][1])) {
                ans = cities[i][1];
            }
        }
        System.out.println(ans);
        String ans1 = destCity(citi);
        System.out.println(ans1);
    }

    public static String destCity(List<List<String>> paths) {
        String ans = "";
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));

        }
        for (int i = 0; i < paths.size(); i++) {
            if (!map.containsKey(paths.get(i).get(1))) {
                ans = paths.get(i).get(1);
            }

        }
        return ans;

    }
}
