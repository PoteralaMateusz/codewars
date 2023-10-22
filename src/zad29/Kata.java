package zad29;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static List<Integer> treeByLevels(Node node)
    {
        List<Integer> result = new ArrayList<>();
        Node nextNode = node;
        Integer leftValue;
        Integer rightValue;
        do {
            result.add(nextNode.value);
            leftValue = nextNode.left.value;
            rightValue = nextNode.right.value;

        }while (leftValue != null && rightValue != null);

        return null;
    }

    public static void main(String[] args) {
        Kata.treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1))
                .forEach(number -> {
                    System.out.print(number + ",");
                });
    }
}
