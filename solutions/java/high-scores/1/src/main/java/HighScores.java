import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {


    List<Integer> scores;
    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
    }

    List<Integer> scores() {

        return scores;

    }

    Integer latest() {
        return scores.getLast();
    }

    Integer personalBest() {

        return scores.stream().max(Integer::compareTo).get();
    }


    List<Integer> personalTopThree() {

        List<Integer> scoreList = new ArrayList<>(scores);
        if(scores.size() < 3) {
            Collections.sort(scoreList);
            return List.copyOf(scoreList).reversed();
        }
        Collections.sort(scoreList);
        return List.copyOf(scoreList).subList(scoreList.size()-3, scoreList.size()).reversed();
    }

}
