import java.util.HashMap;
import java.util.Map;

public class bookmystay {

    private Map<String, Integer> roomAvailability;

    public bookmystay() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }

    static class Room {
        String name;
        int beds;
        double size;
        double pricePerNight;

        Room(String name, int beds, double size, double pricePerNight) {
            this.name = name;
            this.beds = beds;
            this.size = size;
            this.pricePerNight = pricePerNight;
        }
    }

    public static void main(String[] args) {
        bookmystay inventory = new bookmystay();

        Room singleRoom = new Room("Single Room", 1, 250, 1500.0);
        Room doubleRoom = new Room("Double Room", 2, 400, 2500.0);
        Room suiteRoom = new Room("Suite Room", 3, 750, 5000.0);

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Hotel Room Inventory Status\n");

        System.out.println(singleRoom.name + ":");
        System.out.println("Beds: " + singleRoom.beds);
        System.out.println("Size: " + singleRoom.size + " sqft");
        System.out.println("Price per night: " + singleRoom.pricePerNight);
        System.out.println("Available Rooms: " + availability.get(singleRoom.name));
        System.out.println();

        System.out.println(doubleRoom.name + ":");
        System.out.println("Beds: " + doubleRoom.beds);
        System.out.println("Size: " + doubleRoom.size + " sqft");
        System.out.println("Price per night: " + doubleRoom.pricePerNight);
        System.out.println("Available Rooms: " + availability.get(doubleRoom.name));
        System.out.println();

        System.out.println(suiteRoom.name + ":");
        System.out.println("Beds: " + suiteRoom.beds);
        System.out.println("Size: " + suiteRoom.size + " sqft");
        System.out.println("Price per night: " + suiteRoom.pricePerNight);
        System.out.println("Available Rooms: " + availability.get(suiteRoom.name));
    }
}