import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utils {
//    public static int getNum(int[] arr1, int[] arr2) {
//        int num =0;
//
//        return num;
//    }

    public static boolean isNumInArray(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getUserArray(){
        int userCount =1;
        int userNum = 0;
        Scanner scan = new Scanner(System.in);
        int[] userNums = new int[ConstantsClass.COUNT_SET_SIZE];

        while (userCount <= userNums.length) {
            System.out.println("Enter number " + userCount);
            userNum = scan.nextInt();
            if (userNum >= 1 && userNum <= 50 && !Utils.isNumInArray(userNums, userNum)) {
                userNums[userCount - 1] = userNum;
                userCount++;
            }
        }
        return userNums;
    }

    public static int[] getLuckyArray(){
        int[] luckyNums = new int[ConstantsClass.COUNT_SET_SIZE];
        int luckyCount =1;
        int lucky = 0;
        Random random = new Random();
        while (luckyCount <= luckyNums.length) {
            lucky = random.nextInt(50) + 1;

            if (!Utils.isNumInArray(luckyNums, lucky)) {
                luckyNums[luckyCount - 1] = lucky;
                luckyCount++;
            }
        }
        return luckyNums;
    }

    public static int winNums(int[] arr1, int[] arr2){
        int numWin = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (isNumInArray(arr2,arr1[i])){
                numWin++;
            }
        }
        return numWin;
    }

    public static void printWinResult(int num){

        System.out.println("Совпало "+num+ " значений");
    }
}
