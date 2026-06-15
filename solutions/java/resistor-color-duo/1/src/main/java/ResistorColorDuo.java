import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class ResistorColorDuo {

    Map<String, Integer> map = new HashMap<>(Map.of(
            "black", 0,
            "brown", 1,
            "red", 2,
            "orange", 3,
            "yellow", 4,
            "green", 5,
            "blue", 6,
            "violet", 7,
            "grey", 8,
            "white", 9
    ));
    int value(String[] colors) {

        List<Integer> numList = new ArrayList<>();
        Arrays.stream(colors)
                .map(c -> map.get(c))
                .forEach(numList::add);
        StringBuilder sb = new StringBuilder();
        numList.forEach(sb::append);
        while(sb.length() > 2) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return Integer.parseInt(sb.toString());
    }
}
