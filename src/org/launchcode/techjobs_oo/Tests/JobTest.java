package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {

    Job testJob;
    Job testJob2;
    Job testJob3;
    Job testJob4;
    Job testJob5;

    @Before
    public void createJobObj() {
        testJob = new Job();
        testJob2 = new Job();
        testJob3 = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        testJob4 = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        testJob5 = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType("Quality control"),
                new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob.getId(), .001);
        assertEquals(2, testJob2.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob3 instanceof Job);
        assertEquals("Product tester", testJob3.getName());
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob3.equals(testJob4));
    }

    @Test
    public void testToStringToHaveBlankLinesBeforeAndAfter() {
        assertEquals("\nID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n", testJob3.toString());
    }

    @Test
    public void testToStringToHaveLabelsForEachField() {
        assertEquals("\nID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n", testJob3.toString());
    }

    @Test
    public void testEmptyFieldToRespondDataNotAvailable(){
        assertEquals("\nID: 5\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available\n", testJob5.toString());
   }
}

