package nl.feliksik.typing.idtype;

/**
 * A UUID with a generic type.
 * 
 * It's a type safe wrapper for java.util.UUID.
 * 
 */
public final class UUID<T> implements ID<T, java.util.UUID> {
    private java.util.UUID value;

    private UUID(java.util.UUID id) {
        this.value = id;
    }

    /**
     * get a String representation of the id
     */
    public String toString() {
        return value.toString();
    }

    public java.util.UUID getUUID() {
        return value;
    }

    /**
     * Factory method to create a new Uuid
     * 
     * @param uuid
     * @return A {@code Uuid} with the specified value
     * 
     * @throws IllegalArgumentException
     *             If name does not conform to the string representation as
     *             described in {@link UUID#toString}
     */
    public static <U> UUID<U> create(String uuid) {
        return new UUID<>(java.util.UUID.fromString(uuid));
    }
    
    public static <U> UUID<U> create(java.util.UUID uuid) {
        return new UUID<>(uuid);
    }

    public <U> UUID<U> crossContext() {
        return (UUID<U>) this;
    }

    @Override
    public java.util.UUID getRaw() {
        return value;
    }
}
