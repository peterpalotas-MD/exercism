public class PangramChecker {

    public boolean isPangram(String input) {

        char[] alphabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n', 'o', 'p',  'q', 'r', 's', 't','v', 'w', 'x', 'y', 'z'};
        input = input.toLowerCase();
        for (char c : alphabet) {
            if (input.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

}
