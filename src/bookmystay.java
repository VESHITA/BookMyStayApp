import java.util.Scanner;

public class bookmystay {

    protected String roomNumber;
    protected int numberOfBeds;
    protected double roomSize;
    protected double pricePerNight;

    public bookmystay(String roomNumber, int numberOfBeds, double roomSize, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.roomSize = roomSize;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getRoomSize() {
        return this.roomSize;
    }

    public double getPricePerNight() {
        return this.pricePerNight;
    }

    public String getRoomType() {
        return "Standard Room";
    }

    public void displayRoomDetails() {
        System.out.println("\nRoom Details");
        System.out.println("Room Number   : " + this.roomNumber);
        System.out.println("Room Type     : " + this.getRoomType());
        System.out.println("Number of Beds: " + this.numberOfBeds);
        System.out.println("Room Size     : " + this.roomSize + " sq ft");
        System.out.println("Price/Night   : $" + this.pricePerNight);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        String roomNumber = sc.nextLine();

        System.out.print("Enter Number of Beds: ");
        int beds = sc.nextInt();

        System.out.print("Enter Room Size (sq ft): ");
        double size = sc.nextDouble();

        System.out.print("Enter Price per Night: ");
        double price = sc.nextDouble();

        bookmystay room = new bookmystay(roomNumber, beds, size, price);

        room.displayRoomDetails();

        sc.close();
    }
}