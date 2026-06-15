import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class RnaTranscription {
    Map<String, String> map = new HashMap<>(Map.of(
            "G", "C",
            "C", "G",
            "T", "A",
            "A", "U"
    ));
    String transcribe(String dnaStrand) {


        char[] c =  dnaStrand.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char protein : c) {
            sb.append(map.get(String.valueOf(protein)));
        }

        return sb.toString();

    }

}
