package collectionslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> winningNumbers = getWiningNumbers(lotteryType, ballCount);
        Collections.sort(winningNumbers);
        return winningNumbers;
    }

    private List<Integer> getWiningNumbers(int lotteryType, int ballCount) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= ballCount; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers.subList(0, lotteryType);
    }


    public static void main(String[] args) {
        System.out.println(new Lottery().selectWinningNumbers(5, 90));
    }
}
