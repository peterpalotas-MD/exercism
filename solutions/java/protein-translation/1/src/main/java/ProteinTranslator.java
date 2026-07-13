import java.util.*;

class ProteinTranslator {

    Map<String, String> proteinMap = Map.ofEntries(
            Map.entry("AUG", "Methionine"),
            Map.entry("UUU", "Phenylalanine"),
            Map.entry("UUC", "Phenylalanine"),
            Map.entry("UUA", "Leucine"),
            Map.entry("UUG", "Leucine"),
            Map.entry("UCU", "Serine"),
            Map.entry("UCC", "Serine"),
            Map.entry("UCA", "Serine"),
            Map.entry("UCG", "Serine"),
            Map.entry("UAU", "Tyrosine"),
            Map.entry("UAC", "Tyrosine"),
            Map.entry("UGU", "Cysteine"),
            Map.entry("UGC", "Cysteine"),
            Map.entry("UGG", "Tryptophan"),
            Map.entry("UAA", "STOP"),
            Map.entry("UAG", "STOP"),
            Map.entry("UGA", "STOP"));

    List<String> translate(String rnaSequence) {

        char[] rnaSequenceArray = rnaSequence.toCharArray();
        List<String> output = new ArrayList<>();
        for(int i =0; i<rnaSequenceArray.length; i+=3){
            if(i+2>=rnaSequenceArray.length){
                throw new IllegalArgumentException("Invalid codon");
            }
            String rna = rnaSequenceArray[i] +String.valueOf(rnaSequenceArray[i+1])+ rnaSequenceArray[i + 2];
            String protein = proteinMap.get(rna);
            System.out.println(protein);
            if(protein == null){
                throw new IllegalArgumentException("Invalid codon");
            }
            if(protein.equals("STOP")){
                return output;
            }
            output.add(protein);
        }
        return output;
    }
}
