// DJ Trost | CSD320 | Assignment 8 | 2 July 2023
// Prints yearly service charge with various added services and discounts

public class YearlyService {
    public static void main(String[] args) {
        // Runs the program exactly 2 times
        for (int i = 0; i < 2; i++) {
            System.out.printf("Yearly Service: %.2f\n", yearlyService());
            System.out.printf("Yearly Service with Oil Change: %.2f\n", yearlyService(1));      // 1 equals on for service
            System.out.printf("Yearly Service with Oil Change and Tire Rotation: %.2f\n", yearlyService(1,1));
            System.out.printf("Yearly Service with Oil Change and Tire Rotation and Coupon: %.2f\n", yearlyService(1,1,1));
            System.out.print("\n");
        }
    }

    // Basic yearly service
    public static double yearlyService() {
        double service = 350.0;

        return service;

    }

    // Basic yearly service with oil change added
    public static double yearlyService(int oil) {
        double service = 350.0;
        double oilChange = 20.50;

        service = service + oilChange;

        return service;

    }

    // Basic yearly service with oil change and tire rotation added
    public static double yearlyService(int oil, int tire) {
        double service = 350.0;
        double oilChange = 20.50;
        double tireCharge = 35.75;

        service = service + oilChange + tireCharge;

        return service;

    }

    // Basic yearly service with oil change and tire rotation added with a coupon discount removed
    public static double yearlyService(int oil, int tire, int coupon) {
        double service = 350.0;
        double oilChange = 20.50;
        double tireCharge = 35.75;
        double couponOff = 100.0;

        service = service + oilChange + tireCharge - couponOff;

        return service;

    }
}
