package persistance;

public class Room {
   private long idRoom;
   private int capacity;
   private String name;

    public Room(long idRoom, int capacity, String name) {
        this.idRoom = idRoom;
        this.capacity = capacity;
        this.name = name;
    }

    public long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(long idRoom) {
        this.idRoom = idRoom;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
