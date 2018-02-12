package nl.feliksik.typing.example.boundedcontext.people;

import nl.feliksik.typing.idtype.StringId;

public class Person {
    StringId<Person> id;

    public Person(StringId<Person> id) {
        this.id = id;
    }

    public String toString() {
        return "a person with id " + id;
    }
}
