package part1;

public class ParkedCar {
    String brand;
    String model;
    String colour;
    String licenseNumber;
    int minutesParked;

    public ParkedCar(String brand, String model, String colour, String licenseNumber, int minutesParked) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    public int getMinutesParked() {
        return minutesParked;
    }
}
