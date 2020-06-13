import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LockerTest {

    @Test
    public void should_return_ticket_when_save_bag_given_locker_has_room() {
        final Locker locker = new Locker(true);

        final Bag bag = new Bag();
        Ticket actual = locker.save(bag);

        assertNotNull(actual);
    }
}
