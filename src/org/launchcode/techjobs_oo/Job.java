package org.launchcode.techjobs_oo;

import java.util.Objects;
import java.util.ArrayList;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private ArrayList<Object> index;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name,
               Employer employer,
               Location location,
               PositionType positionType,
               CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String notFound = "Data not available";
        String namE = getName();
        String employeR = getEmployer().toString();
        String locatioN = getLocation().toString();
        String positionTypE = getPositionType().toString();
        String coreCompetencY = getCoreCompetency().toString();
        String oops = "OOPS! This job does not seem to exist.";

        if (namE == null || namE == "") {
            namE = notFound;
        } if (employeR == null || employeR == "") {
            employeR = notFound;
        } if (locatioN == null || locatioN == "") {
            locatioN = notFound;
        } if (positionTypE == null || positionTypE == "") {
            positionTypE = notFound;
        } if (coreCompetencY == null || coreCompetencY.equals("")) {
            coreCompetencY = notFound;
        }
        return "\nID: " + id + "\n" +
                "Name: " + namE + "\n" +
                "Employer: " + employeR + "\n" +
                "Location: " + locatioN + "\n" +
                "Position Type: " + positionTypE + "\n" +
                "Core Competency: " + coreCompetencY + "\n";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
