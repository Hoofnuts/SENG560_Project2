package arithmetic;

public class Division implements Divider {
    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
    @Override
    public float divide(float num1, float num2) {
        return num1 / num2;
    }
    @Override
    public float divide(float num1, int num2) {
        return num1 / num2;
    }
    @Override
    public String divideBinary(String num1, String num2) {
        int first = Integer.parseInt(num1, 2);
        int second = Integer.parseInt(num2, 2);
        int quotient = divide(first, second);
        return Integer.toBinaryString(quotient);
        //return Integer.toBinaryString(multiply(Integer.parseInt(num1, 2), Integer.parseInt(num2, 2)));
    }
    public String divideHex(String num1, String num2) {
        int first = Integer.parseInt(num1, 16);
        int second = Integer.parseInt(num2, 16);
        int quotient = divide(first, second);
        return Integer.toHexString(quotient);
    }
}