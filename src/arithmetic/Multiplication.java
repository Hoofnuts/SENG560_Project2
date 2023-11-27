package arithmetic;

public class Multiplication implements Multiplier {
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
    @Override
    public float multiply(float num1, int num2) {
        return num1 * num2;
    }
    @Override
    public String multiplyBinary(String num1, String num2) {
        int first = Integer.parseInt(num1, 2);
        int second = Integer.parseInt(num2, 2);
        int product = multiply(first, second);
        return Integer.toBinaryString(product);
        //return Integer.toBinaryString(multiply(Integer.parseInt(num1, 2), Integer.parseInt(num2, 2)));
    }
    public String multiplyHex(String num1, String num2) {
        int first = Integer.parseInt(num1, 16);
        int second = Integer.parseInt(num2, 16);
        int product = multiply(first, second);
        return Integer.toHexString(product);
    }
}