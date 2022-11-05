package org.example;


import org.example.entities.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /*@Test
    public void testEntities() {
        Student student = new Student("Jack");
        University university = new University();
        Assert.assertEquals("Jack", student.getName());
        university.study(student);
        Assert.assertEquals(student.getName() + " end university", outputStreamCaptor.toString().trim());
    }*/

    /*@Test
    public void testCourses() {
        Student student = new Student("Jack");
        Course course = new Course();
        University university = new University(course);
        university.study(student);
        Assert.assertEquals(student.getName() +" listened lectures.\r\n" +
                student.getName() +" passed laboratory works\r\n" +
                student.getName() +" passed session\r\n" +
                student.getName() +" end university", outputStreamCaptor.toString().trim());
    }*/

    @Test
    public void testChain() {
        Student student = new Student("Jack");
        University university = new University();
        university.study(student);
        Assert.assertEquals(student.getName() + " listened lectures.\r\n" +
                student.getName() + " passed laboratory works\r\n" +
                student.getName() + " passed course work\r\n" +
                student.getName() + " passed session\r\n" +
                student.getName() + " end university", outputStreamCaptor.toString().trim());

        outputStreamCaptor.reset();

        Student student1 = new Student("John");
        university.setCourse(Course.link(
                new Lectures(),
                new LaboratoryWorks(),
                new Session()
        ));
        university.study(student1);
        Assert.assertEquals(student1.getName() + " listened lectures.\r\n" +
                student1.getName() + " passed laboratory works\r\n" +
                student1.getName() + " passed session\r\n" +
                student1.getName() + " end university", outputStreamCaptor.toString().trim());
    }


    @After
    public void tearDown() {
        System.setOut(standardOut);
    }
}
