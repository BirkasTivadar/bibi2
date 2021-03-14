package collectionslist;

import java.util.*;

public class Draw {

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) {
        if (maxNumber <= drawCount) {
            throw new IllegalArgumentException(String.format("drawCount must be less then %d!", drawCount));
        }
        Set<Integer> result = new TreeSet<>();
        Queue<Integer> winningNumbers = new LinkedList<>(getIntegers(drawCount, maxNumber));
        for (int i = 0; i < drawCount; i++) {
            result.add(winningNumbers.poll());
        }
        return result;
    }

    private List<Integer> getIntegers(int drawCount, int maxNumber) {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= maxNumber; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers.subList(0, drawCount);
    }
}
