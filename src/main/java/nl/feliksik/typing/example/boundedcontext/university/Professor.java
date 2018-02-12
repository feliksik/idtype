package nl.feliksik.typing.example.boundedcontext.university;

import nl.feliksik.typing.idtype.StringId;

public class Professor {
    StringId<Professor> id;

    public Professor(StringId<Professor> id) {
        this.id = id;
    }

    public String toString() {
        return "a professor with id " + id;
    }
}
