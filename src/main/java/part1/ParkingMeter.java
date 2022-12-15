package part1;

public class ParkingMeter {
    String brand;
    String model;
    String colour;
    String licenseNumber;
    int minutesPurchased;

    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }
}
