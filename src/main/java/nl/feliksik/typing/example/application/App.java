package nl.feliksik.typing.example.application;

import nl.feliksik.typing.example.boundedcontext.people.Person;
import nl.feliksik.typing.example.boundedcontext.university.Professor;
import nl.feliksik.typing.example.boundedcontext.university.University;
import nl.feliksik.typing.idtype.StringId;

/**
 * Type safe id's
 */
public class App {
    public static void main(String[] args) {
        // bounded context 'people'
        Person person;

        // bounded context 'university'
        University university;
        Professor professor;

        // create an id; you will normally don't do this in many places (except
        // for tests), so the syntactic overhead is limited.
        StringId<Person> personId = StringId.create("12");

        // this is fine
        person = new Person(personId);

        // we are guarded from erroneously using a wrong id.
        professor = new Professor(personId); // impossible
        university = new University(personId); // impossible

        // we can intentionally cross a bounded context, when People and
        // Professor use the same id's.
        professor = new Professor(personId.<Professor>crossContext());

        // but then we still need to be careful, of course.
        university = new University(personId.<University>crossContext());

        System.out.println(person);
        System.out.println(professor);
        System.out.println(university);
    }
}
