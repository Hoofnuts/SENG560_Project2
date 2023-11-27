package arithmetic;

interface Divider {

    int divide (int num1, int num2);
    float divide (float num1, float num2);
    float divide (float num1, int num2);
    String divideBinary (String num1, String num2);
    String divideHex (String num1, String num2);
}
