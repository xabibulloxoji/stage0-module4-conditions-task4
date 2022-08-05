package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        System.out.println(second > first || second == first? "second": "first");
    }
}
