package com.dm.data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MUSICIAN")
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="MUSICIAN_TYPE")
    private String musicianType;

    @Temporal(TemporalType.DATE)
    @Column(name="DOB")
    private Date dob;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMusicianType() {
        return musicianType;
    }

    public void setMusicianType(String musicianType) {
        this.musicianType = musicianType;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
