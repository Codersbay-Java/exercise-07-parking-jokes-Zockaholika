package part1;

public class ParkingTicket {
    int minutes;
    final int firstHour = 25;
    final int hour = 10;
    String officer;
    String brand;

    public ParkingTicket(int minutes, String officer, String model) {
        this.minutes = minutes;
        this.officer = officer;
        this.brand = model;
    }
    @Override
    public String toString() {
        return "Kriminelles Auto: " + brand + " " + " " + " Austeller: " + officer + "\n"
                + "Dein ticket kommt auf $ " + ticketPrice();
    }

    int ticketPrice() {
        if (minutes <= 60){
            return firstHour;
        } else {
            int price = firstHour;
            minutes -= 60;
            for (int i = minutes; i > 0; i -= 60) {
                price += hour;
            }return price;
        }
    }
}
