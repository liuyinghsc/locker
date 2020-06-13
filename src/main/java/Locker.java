public class Locker {
    private final boolean hasRoom;

    public Locker(boolean hasRoom) {
        this.hasRoom = hasRoom;
    }

    public Ticket save(Bag bag) {
        if(hasRoom) {
            return new Ticket();
        } else {
            throw new LockerHasNoRoomException("Locker has no room!");
        }
    }
}
