package nl.feliksik.typing.example.boundedcontext.university;

import nl.feliksik.typing.idtype.StringId;

public class University {

    StringId<University> id;

    public University(StringId<University> id) {
        this.id = id;
    }

    public String toString() {
        return "some university institute with id " + id;
    }
}
