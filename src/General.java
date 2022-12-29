import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class General {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Enter count of parking cars");
        BufferedReader carsStr = new BufferedReader(new InputStreamReader(System.in));
        int cars = Integer.parseInt(String.valueOf(carsStr.readLine()));

        Parking parking = new Parking();
        for (int i = 1; i <= cars; i++) {
            Thread threadi = new Thread(parking);
            threadi.start();
            threadi.join();
        }
    }
}
