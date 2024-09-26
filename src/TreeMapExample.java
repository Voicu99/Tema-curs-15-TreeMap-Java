import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {
        // 1. Associate the specified value with the specified key in a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Mango");
        System.out.println("1. TreeMap after inserting values: " + treeMap);

        // 2. Copy TreeMap content to another TreeMap
        TreeMap<Integer, String> treeMapCopy = new TreeMap<>(treeMap);
        System.out.println("2. Copied TreeMap: " + treeMapCopy);

        // 3. Search for a key in TreeMap
        boolean keyExists = treeMap.containsKey(2);
        System.out.println("3. Key 2 exists: " + keyExists);

        // 4. Search for a value in TreeMap
        boolean valueExists = treeMap.containsValue("Banana");
        System.out.println("4. Value 'Banana' exists: " + valueExists);

        // 5. Get all keys from the TreeMap
        Set<Integer> keys = treeMap.keySet();
        System.out.println("5. All keys: " + keys);

        // 6. Delete all elements from the TreeMap
        treeMap.clear();
        System.out.println("6. TreeMap after clearing: " + treeMap);

        // Reinitialize TreeMap for further examples
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Mango");
        treeMap.put(4, "Grapes");
        treeMap.put(5, "Orange");

        // 7. Sort keys in TreeMap using comparator (In reverse order)
        TreeMap<Integer, String> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());
        reverseSortedMap.putAll(treeMap);
        System.out.println("7. TreeMap sorted in reverse order: " + reverseSortedMap);

        // 8. Get key-value mapping associated with the greatest and least key
        Map.Entry<Integer, String> greatestEntry = treeMap.lastEntry();
        Map.Entry<Integer, String> leastEntry = treeMap.firstEntry();
        System.out.println("8. Greatest key: " + greatestEntry + ", Least key: " + leastEntry);

        // 9. Get the first (lowest) and last (highest) key in TreeMap
        Integer firstKey = treeMap.firstKey();
        Integer lastKey = treeMap.lastKey();
        System.out.println("9. First key: " + firstKey + ", Last key: " + lastKey);

        // 10. Get a reverse order view of the keys
        NavigableSet<Integer> reverseKeys = treeMap.descendingKeySet();
        System.out.println("10. Reverse order view of keys: " + reverseKeys);

        // 11. Get key-value mapping associated with greatest key <= given key
        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(3);
        System.out.println("11. Greatest key <= 3: " + floorEntry);

        // 12. Get the greatest key <= given key
        Integer floorKey = treeMap.floorKey(3);
        System.out.println("12. Greatest key <= 3: " + floorKey);

        // 13. Get the portion of map whose keys are strictly less than given key
        SortedMap<Integer, String> headMap = treeMap.headMap(4);
        System.out.println("13. Portion of map with keys strictly < 4: " + headMap);

        // 14. Get portion of map whose keys are <= given key (inclusive)
        SortedMap<Integer, String> headMapInclusive = treeMap.headMap(4, true);
        System.out.println("14. Portion of map with keys <= 4: " + headMapInclusive);

        // 15. Get least key strictly greater than the given key
        Integer higherKey = treeMap.higherKey(3);
        System.out.println("15. Least key > 3: " + higherKey);

        // 16. Get key-value mapping associated with greatest key strictly less than the given key
        Map.Entry<Integer, String> lowerEntry = treeMap.lowerEntry(3);
        System.out.println("16. Greatest key < 3: " + lowerEntry);

        // 17. Get the greatest key strictly less than the given key
        Integer lowerKey = treeMap.lowerKey(3);
        System.out.println("17. Greatest key < 3: " + lowerKey);
    }
}
