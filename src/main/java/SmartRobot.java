public class SmartRobot {
    private Locker locker1;
    private Locker locker2;

    public SmartRobot(Locker locker1, Locker locker2) {
        this.locker1 = locker1;
        this.locker2 = locker2;
    }


    public Ticket save(Locker locker1, Locker locker2, Bag bag) {
        if (locker1.isHasRoom() == true || locker2.isHasRoom() == true) {
            Ticket ticket = new Ticket(false);
            if (locker1.getRoomSize() >= locker2.getRoomSize()) {
                ticket = locker1.save(bag);
                ticket.setValid(true);
                ticket.setLocker(locker1);
                return ticket;
            } else {
                ticket = locker2.save(bag);
                ticket.setValid(true);
                ticket.setLocker(locker2);
                return ticket;
            }
        } else {
            throw new LockerHasNoRoomException("Locker has no room!");
        }
    }

    public Bag pickUp(Ticket ticket, Locker locker) {
        if (ticket.isValid() == true && ticket.getLocker().equals(locker)) {
            return new Bag();
        }if (ticket.isValid() == true && !ticket.getLocker().equals(locker)) {
            throw new TicketIsNotMatchLockerException("The ticket is not match the locker!");
        }else {
            throw new InvalidTicketException("The ticket is invalid");
        }
    }
}
