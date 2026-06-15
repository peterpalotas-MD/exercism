import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Acronym {



    String phrase;
    String acronym;
    Acronym(String phrase) {


        phrase = phrase.replaceAll(".-", " ");
        phrase = phrase.replaceAll("[-_\\d]", "");
        phrase = phrase.replaceAll("\\s{2}", " ");

        this.phrase = phrase;

        StringBuilder sb = new StringBuilder();

        Arrays.stream(phrase.split(" "))
                .map(word -> word.charAt(0))
                .forEach(sb::append);

        this.acronym = sb.toString().toUpperCase();
    }

    String get() {
        return this.acronym;
    }

}
