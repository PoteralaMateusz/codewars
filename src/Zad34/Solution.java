package Zad34;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int solve(long n) {
        long blockLength = 0;
        List<StringBuilder> blockSequence = new ArrayList<>();
        blockSequence.add(new StringBuilder());
        int sequence = 0;
        int number = 1;
        do {
            blockSequence.get(sequence).append(number);
            if (blockSequence.get(sequence).length() > 100) {
                blockSequence.add(new StringBuilder());
                sequence++;
            }
            blockLength += getBlockSequenceLength(blockSequence);

            if (blockLength >= n) {
                int position = (int) (n - (blockLength - getBlockSequenceLength(blockSequence))) - 1;
                return getNumberAtBlockSequence(blockSequence, position);
            }
            number++;
        } while (true);
    }

    private static int getBlockSequenceLength(List<StringBuilder> blockSequence) {
        return blockSequence.stream()
                .map(a -> a.length())
                .reduce(Integer::sum)
                .orElse(0);
    }

    private static int getNumberAtBlockSequence(List<StringBuilder> blockSequence, long position){
        int actualLength = 0;
        for (StringBuilder block: blockSequence) {
            actualLength += block.length();
            if (actualLength >= position){
                int positionInBlock = (int) (position - (actualLength - block.length()));
                return Character.getNumericValue(block.charAt(positionInBlock));
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(solve(1L));
        System.out.println(solve(2L));
        System.out.println(solve(3L));
        System.out.println(solve(100L));
        System.out.println(solve(123456789L));


    }
}
