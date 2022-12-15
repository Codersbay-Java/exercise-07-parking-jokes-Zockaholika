package part1;

public class PoliceOfficer {
    String name;
    String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public String getName() {
        return name;
    }

    ParkingTicket patrol(ParkedCar car, ParkingMeter meter){
        if(car.minutesParked > meter.getMinutesPurchased()) {
            return new ParkingTicket((car.minutesParked - meter.minutesPurchased), this.name, car.brand);
        } return null;
    }
}
