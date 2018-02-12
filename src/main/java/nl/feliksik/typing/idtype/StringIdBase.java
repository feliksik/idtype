package nl.feliksik.typing.idtype;

/**
 * An id based on a String.
 * 
 * This class can be extended for a particular type of T, giving some
 * domain-specific functionality.
 * 
 * For example, if you have an id for queues, which is the queue name, and that
 * name is based on an account username. An implementation can then make a
 * factory method as follows:
 * 
 * 
 * {@code
 *     public final class QueueId extends StringIdBase<Queue> {
 *         // create a QueueId for user.
 *         public QueueId create(Account a) { 
 *           return "userqueue-" + escape(a.getUsername());  
 *         } 
 *     } 
 * }
 * 
 */
public abstract class StringIdBase<T> implements ID<T, String> {
    private String value;

    public StringIdBase(String id) {
        this.value = id;
    }

    /**
     * get a String representation of the id
     */
    public String toString() {
        return value;
    }

    @Override
    public String getRaw() {
        return value;
    }
}
