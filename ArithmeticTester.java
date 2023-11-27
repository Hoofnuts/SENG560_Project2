import arithmetic.Arithmetic;

public class ArithmeticTester {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();

        //Integer Testing
        System.out.println("Integer Testing:");
        int num1 = 64;
        int num2 = 8;
        System.out.println("add " + num1 + ","+ num2 + " = " + arithmetic.add(num1, num2));
        System.out.println("subtract " + num1 + ","+ num2 + " = " + arithmetic.subtract(num1, num2));
        System.out.println("multiply " + num1 + ","+ num2 + " = " + arithmetic.multiply(num1, num2));
        System.out.println("divide " + num1 + ","+ num2 + " = " + arithmetic.divide(num1, num2));
        System.out.println("");

        //Octal Testing
        System.out.println("Octal Testing:");
        int oct1 = 024;
        int oct2 = 016;
        System.out.println("add " + oct1 + ","+ oct2 + " = " + arithmetic.add(oct1, oct2));
        System.out.println("subtract " + oct1 + ","+ oct2 + " = " + arithmetic.subtract(oct1, oct2));
        System.out.println("multiply " + oct1 + ","+ oct2 + " = " + arithmetic.multiply(oct1, oct2));
        System.out.println("divide " + oct1 + ","+ oct2 + " = " + arithmetic.divide(oct1, oct2));
        System.out.println("");

        //Float & Integer Testing
        System.out.println("Float & Int Testing:");
        float number1 = 77.3f;
        int number2 = 6;
        System.out.println("add " + number1 + ","+ number2 + " = " + arithmetic.add(number1, number2));
        System.out.println("subtract " + number1 + ","+ number2 + " = " + arithmetic.subtract(number1, number2));
        System.out.println("multiply " + number1 + ","+ number2 + " = " + arithmetic.multiply(number1, number2));
        System.out.println("divide " + number1 + ","+ number2 + " = " + arithmetic.divide(number1, number2));
        System.out.println("");

        //Float Testing
        System.out.println("Float Testing:");
        float n1 = 77.3f;
        float n2 = 88.7f;
        System.out.println("add " + n1 + ","+ n2 + " = " + arithmetic.add(n1, n2));
        System.out.println("subtract " + n1 + ","+ n2 + " = " + arithmetic.subtract(n1, n2));
        System.out.println("multiply " + n1 + ","+ n2 + " = " + arithmetic.multiply(n1, n2));
        System.out.println("divide " + n1 + ","+ n2 + " = " + arithmetic.divide(n1, n2));
        System.out.println("");

        //Binary Testing
        System.out.println("Binary Testing:");
        String binary1 = "1111111";
        String binary2 = "1011001";
        System.out.println("add " + binary1 + ","+ binary2 + " = " + arithmetic.addBinary(binary1, binary2));
        System.out.println("subtract " + binary1 + ","+ binary2 + " = " + arithmetic.subtractBinary(binary1, binary2));
        System.out.println("multiply " + binary1 + ","+ binary2 + " = " + arithmetic.multiplyBinary(binary1, binary2));
        System.out.println("divide " + binary1 + ","+ binary2 + " = " + arithmetic.divideBinary(binary1, binary2));
        System.out.println("");

        //Hex Testing
        System.out.println("Hex Testing:");
        String hex1 = "8AB";
        String hex2 = "B78";
        System.out.println("add " + hex1 + ","+ hex2 + " = " + arithmetic.addHex(hex1, hex2));
        System.out.println("subtract " + hex1 + ","+ hex2 + " = " + arithmetic.subtractHex(hex1, hex2));
        System.out.println("multiply " + hex1 + ","+ hex2 + " = " + arithmetic.multiplyHex(hex1, hex2));
        System.out.println("divide " + hex1 + ","+ hex2 + " = " + arithmetic.divideHex(hex1, hex2));

    }
}
