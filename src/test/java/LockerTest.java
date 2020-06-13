import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LockerTest {

    @Test
    public void should_return_ticket_when_save_bag_given_locker_has_room() {
        final Locker locker = new Locker(true);

        final Bag bag = new Bag();
        Ticket actual = locker.save(bag);

        assertNotNull(actual);
    }

    @Test(expected = LockerHasNoRoomException.class )
    public void should_failed_when_save_bag_given_locker_has_no_room() {
        final Locker locker = new Locker(false);

        final Bag bag = new Bag();
        locker.save(bag);
    }

    @Test
    public void should_return_bag_when_pickup_bag_given_valid_ticket() {
        final Locker locker = new Locker(true);

        Ticket ticket = new Ticket(true);
        Bag actual = locker.pickup(ticket);

        assertNotNull(actual);
    }

    @Test(expected = InvalidTicketException.class )
    public void should_failed_when_pickup_bag_given_invalid_ticket() {
        final Locker locker = new Locker(true);

        Ticket ticket = new Ticket(false);
        locker.pickup(ticket);
    }



}
