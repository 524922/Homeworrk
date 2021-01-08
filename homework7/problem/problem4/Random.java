package endTermHomeWork.homework7.problem.problem4;

public class Random {
    public static void main(String[] args) {
        java.util.Random random1 = new java.util.Random(1000);
        for (int i = 1; i <= 100; i++) {
            System.out.println(random1.nextInt(i));
        }
    }
}
