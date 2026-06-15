import java.text.Normalizer;
import java.util.stream.Collectors;

class MicroBlog {
    public String truncate(String input) {
        input = Normalizer.normalize(input, Normalizer.Form.NFC);

        //https://stackoverflow.com/questions/15947992/java-unicode-string-length
        //https://stackoverflow.com/a/53528306
        return input.codePoints()
                .limit(5)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }
}

