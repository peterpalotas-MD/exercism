import java.util.*;

public class Satellite {
    public boolean hasSameElements(List<Character> list1, List<Character> list2) {
    if (list1.size() != list2.size()) {
        throw new IllegalArgumentException("traversals must have the same length");
    }

    // Create copies so we don't mutate the original inputs
    List<Character> copy1 = new ArrayList<>(list1);
    List<Character> copy2 = new ArrayList<>(list2);

    Collections.sort(copy1);
    Collections.sort(copy2);

    Set<Character> set1 = new HashSet<>(copy1);
    if (list1.size() != set1.size()) {
        throw new IllegalArgumentException("traversals must contain unique items");
    }
    return copy1.equals(copy2);
}
public Tree treeFromTraversals(List<Character> preorderInput, List<Character> inorderInput) {
    if (preorderInput.isEmpty()) {
        return new Tree(null);
    }
    if (!hasSameElements(preorderInput, inorderInput)) {
        throw new IllegalArgumentException("traversals must have the same elements");
    }
    Node root = new Node(preorderInput.getFirst());
    for (int i = 1; i < inorderInput.size(); i++) {
        Node currentNode = root;
        boolean done = false;
        Character nodeToInsert = preorderInput.get(i);
        int indexOfCharacter = inorderInput.indexOf(nodeToInsert);
        while (!done) {
            int direction = indexOfCharacter < inorderInput.indexOf(currentNode.value) ? -1 : 1;
            if (direction == -1) {
                if (currentNode.left == null) {
                    currentNode.left = new Node(nodeToInsert);
                    done=true;
                }
                currentNode = currentNode.left;
            }
            if (direction == 1) {
                if (currentNode.right == null) {
                    currentNode.right = new Node(nodeToInsert);
                    done=true;
                }
                currentNode = currentNode.right;
            }
        }
    }

    Tree tree = new Tree(root);
    return tree;
}
}
