import java.util.*;

public class MapsInAction {

    public static void main(String[] args) {

        // ===============================
        // a. Create Map<String, Integer>
        // ===============================
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Ali", 21);
        ages.put("Leyla", 19);
        ages.put("Murad", 23);
        ages.put("Aysel", 20);
        ages.put("Nigar", 22);

        System.out.println("===== HashMap =====");

        // i.1 Enhanced for statement
        System.out.println("\nEnhanced for loop:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // i.2 Iterator
        System.out.println("\nIterator:");
        Iterator<Map.Entry<String, Integer>> iterator =
                ages.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // i.3 toString() method
        System.out.println("\ntoString():");
        System.out.println(ages);


        // =================================================
        // ii. HashMap vs LinkedHashMap vs TreeMap
        // =================================================

        Map<String, Integer> linkedMap = new LinkedHashMap<>(ages);
        Map<String, Integer> treeMap = new TreeMap<>(ages);

        System.out.println("\n===== LinkedHashMap (Insertion Order) =====");
        System.out.println(linkedMap);

        System.out.println("\n===== TreeMap (Natural Alphabetical Order) =====");
        System.out.println(treeMap);


        // =================================================
        // iii. TreeMap in alphabetically NON-ascending order
        // =================================================

        Map<String, Integer> reverseTreeMap =
                new TreeMap<>(Collections.reverseOrder());

        reverseTreeMap.putAll(ages);

        System.out.println("\n===== TreeMap (Reverse Alphabetical Order) =====");
        System.out.println(reverseTreeMap);


        // =================================================
        // iv. Sort HashMap by values (ages) in descending order
        // =================================================

        System.out.println("\n===== HashMap sorted by AGE descending =====");

        // Convert entries to list
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(ages.entrySet());

        // Sort based on values descending
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print sorted result
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}