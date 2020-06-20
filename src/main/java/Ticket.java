public class Ticket {
    private boolean valid;
    private Locker locker;

    public void setLocker(Locker locker) {
        this.locker = locker;
    }

    public Locker getLocker() {
        return locker;
    }

    public Ticket(boolean valid, Locker locker) {
        this.valid = valid;
        this.locker = locker;
    }

    public Ticket(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
