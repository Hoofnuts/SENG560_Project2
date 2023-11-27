package arithmetic;

interface Multiplier {

    int multiply (int num1, int num2);
    float multiply (float num1, float num2);
    float multiply (float num1, int num2);
    String multiplyBinary (String num1, String num2);
    String multiplyHex (String num1, String num2);
}
