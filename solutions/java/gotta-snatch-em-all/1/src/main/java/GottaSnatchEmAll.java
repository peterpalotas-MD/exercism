import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return Set.copyOf(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean myColHasCard = false;
        boolean theirColHasCard = false;

        for(String card : myCollection){
            if(!(theirCollection.contains(card))){
                myColHasCard = true;
                break;
            }
        }
        for(String card : theirCollection){
            if(!(myCollection.contains(card))){
                theirColHasCard = true;
                break;
            }
        }

        return myColHasCard && theirColHasCard;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = Set.copyOf(collections.get(0));
        for(Set<String> collection : collections){
            common = Set.copyOf(common.stream().filter(card -> collection.contains(card)).toList());
        }
        return common;
    }


    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new java.util.HashSet<>(Set.copyOf(collections.get(0)));
        for(Set<String> collection : collections){
            all.addAll(collection);
        }
        return all;
    }
}
