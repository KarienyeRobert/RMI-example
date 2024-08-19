import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public static void main(String[] args) {
        try {
            // Start the RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            // Create an instance of the remote object
            Calculator calculator = new CalculatorImpl();

            // Bind the remote object in the registry with the name "CalculatorService"
            Naming.rebind("CalculatorService", calculator);

            System.out.println("RMI Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
