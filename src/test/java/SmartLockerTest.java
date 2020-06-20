import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SmartLockerTest {
    @Test
    public void should_return_locker1_ticket_when_save_bag_given_locker1_has_more_room() {
        Locker locker1 = new Locker(true, 5);
        Locker locker2 = new Locker(true, 2);

        SmartRobot smartRobot = new SmartRobot(locker1, locker2);

        Bag bag = new Bag();

        Ticket save = smartRobot.save(locker1, locker2, bag);
        assert (save.getLocker().equals(locker1));
    }

    @Test
    public void should_return_locker2_ticket_when_save_bag_given_locker2_has_more_room() {
        Locker locker1 = new Locker(true, 2);
        Locker locker2 = new Locker(true, 5);

        SmartRobot smartRobot = new SmartRobot(locker1, locker2);

        Bag bag = new Bag();

        Ticket save = smartRobot.save(locker1, locker2, bag);
        assert (save.getLocker().equals(locker2));
    }

    @Test
    public void should_return_locker1_ticket_when_save_bag_given_locker1_and_locker2_has_same_room() {
        Locker locker1 = new Locker(true, 2);
        Locker locker2 = new Locker(true, 2);

        SmartRobot smartRobot = new SmartRobot(locker1, locker2);

        Bag bag = new Bag();

        Ticket save = smartRobot.save(locker1, locker2, bag);
        assert (save.getLocker().equals(locker1));
    }

    @Test(expected = LockerHasNoRoomException.class)
    public void should_failed_when_save_bag_given_locker1_and_locker2_have_no_room() {
        Locker locker1 = new Locker(false, 0);
        Locker locker2 = new Locker(false, 0);

        SmartRobot smartRobot = new SmartRobot(locker1, locker2);

        Bag bag = new Bag();

        Ticket save = smartRobot.save(locker1, locker2, bag);
    }

    @Test
    public void should_return_bag_when_pick_up_bag_given_valid_ticket_match_locker() {
        Locker locker1 = new Locker(false, 0);
        Locker locker2 = new Locker(false, 0);
        Ticket ticket = new Ticket(true, locker1);

        SmartRobot smartRobot = new SmartRobot(locker1, locker2);

        Bag bag = smartRobot.pickUp(ticket,locker1);

        assertNotNull(bag);

    }

    @Test(expected = TicketIsNotMatchLockerException.class)
    public void should_failed_when_pick_up_bag_given_valid_ticket_not_match_locker() {
        Locker locker1 = new Locker(false, 0);
        Locker locker2 = new Locker(false, 0);
        Ticket ticket = new Ticket(true, locker1);

        SmartRobot smartRobot = new SmartRobot(locker1, locker2);

        smartRobot.pickUp(ticket,locker2);
    }

    @Test(expected = InvalidTicketException.class)
    public void should_failed_when_pick_up_bag_given_invalid_ticket() {
        Locker locker1 = new Locker(false, 0);
        Locker locker2 = new Locker(false, 0);
        Ticket ticket = new Ticket(false, locker1);

        SmartRobot smartRobot = new SmartRobot(locker1, locker2);

        smartRobot.pickUp(ticket,locker2);
    }



}
