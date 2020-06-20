import jdk.nashorn.internal.objects.annotations.Getter;

public class Locker {
    private final boolean hasRoom;
    private int roomSize;

    public Locker(boolean hasRoom, int roomSize) {
        this.hasRoom = hasRoom;
        this.roomSize = roomSize;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public Locker(boolean hasRoom) {
        this.hasRoom = hasRoom;
    }

    public boolean isHasRoom() {
        return hasRoom;
    }

    public Ticket save(Bag bag) {
        if(hasRoom) {
            return new Ticket(true);
        } else {
            throw new LockerHasNoRoomException("Locker has no room!");
        }
    }
    public Bag pickup(Ticket ticket) {
        if (ticket.isValid()){
            ticket.setValid(false);
            return new Bag();
        }else {
            throw  new InvalidTicketException("Invalid Ticket");
        }
    }
}
