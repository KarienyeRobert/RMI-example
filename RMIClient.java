import java.rmi.Naming;

public class RMIClient {

    public static void main(String[] args) {
        try {
            // Lookup the remote object in the RMI registry
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost:1099/CalculatorService");

            // Invoke remote methods
            int resultAdd = calculator.add(5, 3);
            int resultSubtract = calculator.subtract(9, 4);
            int resultMultiply = calculator.multiply(3324, 7326443);
            int resultDivide = calculator.divide(  535632, 156313);

            System.out.println("Addition Result: " + resultAdd);
            System.out.println("Subtraction Result: " + resultSubtract);
            System.out.println("Multiplication Result: " + resultMultiply);
            System.out.println("Division Result: " + resultDivide);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
