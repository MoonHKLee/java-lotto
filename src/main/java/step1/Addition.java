package step1;

public class Addition implements Operation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
