import java.util.Map;

class ResistorColorTrio {

    private static final Map<String, Integer> COLOR_VALUES = Map.of(
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
    );

    String label(String[] colors) {
        int firstDigit = COLOR_VALUES.get(colors[0]);
        int secondDigit = COLOR_VALUES.get(colors[1]);
        int zeroes = COLOR_VALUES.get(colors[2]);

        long value = (firstDigit * 10L + secondDigit) * (int) Math.pow(10, zeroes);

        if (value == 0) {
            return "0 ohms";
        }

        String[] units = {"ohms", "kiloohms", "megaohms", "gigaohms"};
        int unitIndex = 0;

        while (value >= 1000 && value % 1000 == 0) {
            value /= 1000;
            unitIndex++;
        }

        return value + " " + units[unitIndex];
    }
}