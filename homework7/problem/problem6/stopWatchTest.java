package endTermHomeWork.homework7.problem.problem6;

import java.util.Random;

public class stopWatchTest {
    public static void main(String[] args) {
        final int NUM=100000;
        int[] number=new int[NUM];
        Random random = new Random();
        for (int i = 0; i < NUM; i++) {
            number[i]=random.nextInt(NUM);
        }
        stopWatchTest stopWatchTest = new stopWatchTest();
    }

}
