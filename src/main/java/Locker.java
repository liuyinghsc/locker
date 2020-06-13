public class Locker {
    private final boolean hasRoom;

    public Locker(boolean hasRoom) {
        this.hasRoom = hasRoom;
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
            return new Bag();
        }else {
            throw  new InvalidTicketException("Invalid Ticket");
        }
    }
}
