package map_elements_count;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Object> personList = new ArrayList<>();
        personList.add(new PersonExample("Мария"));
        personList.add(new PersonExample("Андрей"));
        personList.add(new PersonExample("Андрей"));
        personList.add(new PersonExample("Андрей"));
        personList.add(new PersonExample("Мария"));
        personList.add(new PersonExample("Евгений"));
        countMap(personList);
    }

    static Map<Object, Integer> countMap(List<Object> list) {
        HashMap<Object, Integer> result = new HashMap<>();
        for (Object object : list) {
            if (result.containsKey(object)) {
                int count = result.get(object) + 1;
                result.put(object, count);
            } else {
                result.put(object, 1);
            }
        } return result;
    }
}
