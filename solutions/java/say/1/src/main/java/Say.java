public class Say {

    private static final String[] ONES = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] ILLIONS = {
            "", " thousand", " million", " billion"
    };

    public String say(long number) {
        if (number < 0 || number > 999_999_999_999L) {
            throw new IllegalArgumentException("Number out of range");
        }

        if (number == 0) {
            return ONES[0];
        }

        String result = "";
        int groupIndex = 0;

        while (number > 0) {
            int chunk = (int) (number % 1000);

            if (chunk != 0) {
                String chunkText = convertChunk(chunk) + ILLIONS[groupIndex];
                if (result.isEmpty()) {
                    result = chunkText;
                } else {
                    result = chunkText + " " + result;
                }
            }

            number /= 1000;
            groupIndex++;
        }

        return result.trim();
    }

    private String convertChunk(int number) {
        String chunkResult = "";

        if (number >= 100) {
            chunkResult += ONES[number / 100] + " hundred";
            number %= 100;
            if (number > 0) {
                chunkResult += " ";
            }
        }

        if (number >= 20) {
            chunkResult += TENS[number / 10];
            if (number % 10 > 0) {
                chunkResult += "-" + ONES[number % 10];
            }
        } else if (number > 0) {
            chunkResult += ONES[number];
        }

        return chunkResult;
    }
}