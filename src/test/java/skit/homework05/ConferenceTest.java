package skit.homework05;


import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConferenceTest {

    // TODO: Add tests here!
    Conference conference;

    @Before
    public void init() {
        conference = new Conference(1);
    }

    @Test
    public void addAttendeeTest() {
        Student student = new Student("John", "Doe", Course.OS, 20);
        student.setName("Dimitrija");
        student.setSurname("Timeski");
        student.setCourse(Course.OTHER);
        student.setAge(21);
        assertEquals("Dimitrija", student.getName());
        assertEquals("Timeski", student.getSurname());
        assertEquals(Course.OTHER, student.getCourse());
        assertEquals(21, student.getAge());
        assertEquals("Student{name='Dimitrija', surname='Timeski', course=OTHER, age=21}", student.toString());

        assertTrue(conference.addAttendeeToConference(student));
        assertEquals(1, conference.getAttendees().size(), 0);
        assertEquals(1, conference.getCapacity(), 0);
    }

    @Test
    public void AddAttendeesEdgeTest() {
        Student student = new Student("John", "Doe", Course.OS, 20);
        conference.addAttendeeToConference(student);
        conference.addAttendeeToConference(student);
        assertEquals(2, conference.getAttendees().size(), 0);
        assertEquals(3, conference.getCapacity(), 0);
        conference.addAttendeeToConference(student);
        assertEquals(3, conference.getAttendees().size(), 0);
    }

    @Test
    public void AddAttendeeMaxTest() {
        Student student = new Student("John", "Doe", Course.OS, 20);
        for (int i = 0; i < 6561; i++) {
            conference.addAttendeeToConference(student);
        }
        assertEquals(6561, conference.getAttendees().size(), 0);
        assertEquals(6561, conference.getCapacity(), 0);
    }

    @Test
    public void AddAttendeeOverMaxTest() {
        Student student = new Student("John", "Doe", Course.OS, 20);
        for (int i = 0; i < 6561; i++) {
            assertTrue(conference.addAttendeeToConference(student));
        }
        assertFalse(conference.addAttendeeToConference(student));

        assertEquals(6561, conference.getAttendees().size(), 0);
        assertEquals(6561, conference.getCapacity(), 0);
    }

    @Test
    public void TripleCapacityCapTest() {
        for (int i = 3; i <= 6561; i = i * 3) {
            assertTrue(conference.tripleCapacity());
            assertEquals(i, conference.getCapacity(), 0);
        }
        assertFalse(conference.tripleCapacity());
    }

    @Test
    public void TripleCapacityEdgeTest() {
        conference = new Conference(3333);
        assertTrue(conference.tripleCapacity());
    }

    @Test
    public void CalculateTotalPricePaidEmtTest() {
        Student student = new Student("Dimitrija", "Timeski", Course.EMT, 22);
        conference.addAttendeeToConference(student);
        double price = (Conference.TICKET_PRICE * (1 - Conference.EMT_DISCOUNT));
        assertEquals(price, conference.calculateTotalPricePaid(), 0);
    }

    @Test
    public void CalculateTotalPricePaidWebTest() {
        Student student2 = new Student("Branka", "Tashovska", Course.WEB, 23);
        conference.addAttendeeToConference(student2);
        double price = (Conference.TICKET_PRICE * (1 - Conference.WEB_DISCOUNT));
        assertEquals(price, conference.calculateTotalPricePaid(), 0);
    }

    @Test
    public void CalculateTotalPricePaidOtherTest() {
        Student student3 = new Student("Tomislav", "Stojceski", Course.OS, 25);
        conference.addAttendeeToConference(student3);
        double price = Conference.TICKET_PRICE;
        assertEquals(price, conference.calculateTotalPricePaid(), 0);
    }

    @Test
    public void CalculateTotalPricePaidTest() {
        Student student = new Student("Dimitrija", "Timeski", Course.EMT, 22);
        Student student2 = new Student("Branka", "Tashovska", Course.WEB, 23);
        Student student3 = new Student("Tomislav", "Stojceski", Course.OS, 25);

        conference.addAttendeeToConference(student);
        conference.addAttendeeToConference(student2);
        conference.addAttendeeToConference(student3);

        double price = (Conference.TICKET_PRICE * (1 - Conference.EMT_DISCOUNT)) +
                (Conference.TICKET_PRICE * (1 - Conference.WEB_DISCOUNT)) +
                Conference.TICKET_PRICE;

        assertEquals(price, conference.calculateTotalPricePaid(), 0);
    }


}