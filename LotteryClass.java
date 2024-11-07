import java.util.Random;
import java.util.Scanner;

public class LotteryClass {
    public void run() {

        int countWin = 0;
        int[] luckyNums = new int[ConstantsClass.COUNT_SET_SIZE];
        luckyNums = Utils.getLuckyArray();

        for (int i = 0; i < ConstantsClass.COUNT_PLAYER; i++) {
            int[] userNums = new int[ConstantsClass.COUNT_SET_SIZE];
            userNums = Utils.getUserArray();
            Utils.printArray(luckyNums);
            Utils.printArray(userNums);
            countWin = Utils.winNums(luckyNums, userNums);
            Utils.printWinResult(countWin);
        }
    }

}
