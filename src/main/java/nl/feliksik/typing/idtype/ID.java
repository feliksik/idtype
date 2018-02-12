package nl.feliksik.typing.idtype;

/**
 * A UUID with a generic type.
 * 
 * It implements an id for the domain concept T, where the id is represented by
 * an object of type V.
 * 
 */
public interface ID<T, V> {

    /**
     * Cross a bounded context, converting an id from one generics type to
     * another one.
     * 
     * This loses static type checking, and the sensibility of this conversion
     * is no longer enforced by the type system.
     * 
     * It is intended for use when class T an U represent the same concept, and
     * thus use the same set of id's, but are implementations in different
     * Bounded Contexts. It allows one to do type conversion in your Application
     * Layer, without a dependency relations between the bounded contexts T and
     * U.
     * 
     * Can be implemented for some ImplementingSubtypeID as: <br>
     * 
     * <pre>
     * public <U> ImplementingSubtypeID<U> cross() {
     *     return (ImplementingSubtypeID<U>) this;
     * }
     * </pre>
     * 
     * @return
     */
    public <U> ID<U, V> crossContext();

    /**
     * get the underlying id implementation
     * 
     * @return
     */
    public V getRaw();
}
