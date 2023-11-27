package arithmetic;

public class Arithmetic implements Adder, Subtractor, Multiplier, Divider {

    //Prefix an integer with a "0" to use octals

    //=================================================================
    //Addition methods
    public int add (int num1, int num2) {return new Addition().add(num1, num2);}
    public float add (float num1, float num2) {return new Addition().add(num1, num2);}
    public float add (float num1, int num2){return new Addition().add(num1, num2);}
    public String addBinary (String num1, String num2) {return new Addition().addBinary(num1, num2);}
    public String addHex (String num1, String num2) {return new Addition().addHex(num1, num2);}

    //=================================================================
    //Subtraction methods
    public int subtract (int num1, int num2) {return new Subtraction().subtract(num1, num2);}
    public float subtract (float num1, float num2) {return new Subtraction().subtract(num1, num2);}
    public float subtract (float num1, int num2) {return new Subtraction().subtract(num1, num2);}
    public String subtractBinary (String num1, String num2) {return new Subtraction().subtractBinary(num1, num2);}
    public String subtractHex (String num1, String num2) {return new Subtraction().subtractHex(num1, num2);}

    //=================================================================
    //Multiplication methods
    public int multiply (int num1, int num2) {return new Multiplication().multiply(num1, num2);}
    public float multiply (float num1, float num2) {return new Multiplication().multiply(num1, num2);}
    public float multiply (float num1, int num2) {return new Multiplication().multiply(num1, num2);}
    public String multiplyBinary (String num1, String num2) {return new Multiplication().multiplyBinary(num1, num2);}
    public String multiplyHex (String num1, String num2) {return new Multiplication().multiplyHex(num1, num2);}

    //=================================================================
    //Division methods
    public int divide (int num1, int num2) {return new Division().divide(num1, num2);}
    public float divide (float num1, float num2) {return new Division().divide(num1, num2);}
    public float divide (float num1, int num2) {return new Division().divide(num1, num2);}
    public String divideBinary (String num1, String num2) {return new Division().divideBinary(num1, num2);}
    public String divideHex (String num1, String num2) {return new Division().divideHex(num1, num2);}
}