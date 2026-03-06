abstract class BookMyStayApp {
    protected String roomNumber;
    protected int numberOfBeds;
    protected double roomSize;
    protected double pricePerNight;

    public BookMyStayApp(String roomNumber, int numberOfBeds, double roomSize, double pricePerNight) {
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

    public abstract String getRoomType();

    public void displayRoomDetails() {
        System.out.println("Room Number   : " + this.roomNumber);
        System.out.println("Room Type     : " + this.getRoomType());
        System.out.println("Number of Beds: " + this.numberOfBeds);
        System.out.println("Room Size     : " + this.roomSize + " sq ft");
        System.out.println("Price/Night   : $" + this.pricePerNight);
        System.out.println("-----------------------------");
    }
}