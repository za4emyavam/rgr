package org.example;


import org.example.entities.Student;
import org.example.entities.University;
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

    @Test
    public void testEntities() {
        Student student = new Student("Jack");
        University university = new University();
        Assert.assertEquals("Jack", student.getName());
        university.study(student);
        Assert.assertEquals(student.getName() + " end university", outputStreamCaptor.toString().trim());
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

}
