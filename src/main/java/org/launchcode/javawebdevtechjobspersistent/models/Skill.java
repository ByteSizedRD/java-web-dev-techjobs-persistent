package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank(message="Description cannot be blank")
    @Size(min=3, max=500, message="Description must be between 3 and 500 characters.")
    private String description;

    @ManyToMany(mappedBy = "skill")
    private final List<Job> jobs = new ArrayList<>();

    //Getters, Setters, Constructors
    public Skill(String description, List<Job> jobs) {
        super();
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    }