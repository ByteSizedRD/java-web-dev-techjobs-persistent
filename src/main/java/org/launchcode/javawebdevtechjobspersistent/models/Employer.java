package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany(mappedBy = "employer")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message="Please provide a location")
    @Size(min=3, max=100, message="Employer can only have one location")
    public String location;


    //Getters, Setters, and constructors

    public Employer(String location) {
        super();
        this.location = location;
        this.jobs = jobs;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
