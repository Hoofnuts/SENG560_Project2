package arithmetic;

public interface Subtractor {

    int subtract (int num1, int num2);
    float subtract (float num1, float num2);
    float subtract (float num1, int num2);
    String subtractBinary (String num1, String num2);
    String subtractHex (String num1, String num2);
}
