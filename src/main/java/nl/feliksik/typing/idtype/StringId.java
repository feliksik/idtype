package nl.feliksik.typing.idtype;

/**
 * A String id with a generic type.
 * 
 * Purpose is to get compile-time type checking of the id, and distinguish an
 * identifier from entity A from an id for entity B.
 * 
 */
public final class StringId<T> extends StringIdBase<T> {
    private StringId(String id) {
        super(id);
    }

    public <U> StringId<U> crossContext() {
        return (StringId<U>) this;
    }

    public static <U> StringId<U> create(String id) {
        return new StringId<U>(id);
    }
}
