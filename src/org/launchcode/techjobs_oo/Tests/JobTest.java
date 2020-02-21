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
    @Before
    public void createJobObj() {testJob = new Job();}
    @Before
    public void createSecondJobObj(){testJob2 = new Job();}
    @Before
    public void createThirdJobObj(){
        testJob3 = new Job(
            "Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));}
     @Before
     public void createFourthJobObj(){
        testJob4 = new Job(
                 "Product tester",
                 new Employer("ACME"),
                 new Location("Desert"),
                 new PositionType("Quality control"),
                 new CoreCompetency("Persistence"));}

    @Test
    public void testSettingJobId(){
        assertEquals(1, testJob.getId(), .001);
        assertEquals(2, testJob2.getId(), .001);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(testJob3 instanceof Job);
        assertEquals("Product tester", testJob3.getName());
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(testJob3.getId() == testJob4.getId());
    }
}
