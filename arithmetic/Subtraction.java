package arithmetic;

public class Subtraction implements Subtractor {
    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public float subtract(float num1, float num2) {
        return num1 - num2;
    }
    @Override
    public float subtract(float num1, int num2) {
        return num1 - num2;
    }
    @Override
    public String subtractBinary(String num1, String num2) {
        int first = Integer.parseInt(num1, 2);
        int second = Integer.parseInt(num2, 2);
        int difference = subtract(first, second);
        return Integer.toBinaryString(difference);
    }
    public String subtractHex(String num1, String num2) {
        int first = Integer.parseInt(num1, 16);
        int second = Integer.parseInt(num2, 16);
        int difference = subtract(first, second);
        return Integer.toHexString(difference);
    }
}