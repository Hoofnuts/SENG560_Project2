package arithmetic;

class Addition implements Adder{

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public float add(float num1, float num2) {
        return num1 + num2;
    }
    @Override
    public float add(float num1, int num2) {
        return num1 + num2;
    }
    @Override
    public String addBinary(String num1, String num2) {
        int first = Integer.parseInt(num1, 2);
        int second = Integer.parseInt(num2, 2);
        int sum = add(first, second);
        return Integer.toBinaryString(sum);
    }
    public String addHex(String num1, String num2) {
        int first = Integer.parseInt(num1, 16);
        int second = Integer.parseInt(num2, 16);
        int sum = add(first, second);
        return Integer.toHexString(sum);
    }
}
