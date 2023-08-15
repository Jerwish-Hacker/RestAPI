package com.jerwish.FireBlade.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SID", length = 10, nullable = false)
    private Long sid;
    
    @Column(name = "Firstname", length = 20, nullable = false)
    private String fname;
    
    @Column(name = "Lastname", length = 20, nullable = false)
    private String lname;
    
    @Column(name = "Phoneno", length = 20, nullable = false)
    private Long phone;
    
    @Column(name = "GPA", length = 10, nullable = false)
    private Long gpa;
    
    public student() {
    }
    
    public student(Long sid, String fname, String lname, Long phone, Long gpa) {
        super();
        this.sid = sid;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.gpa = gpa;
    }
    
    public Long getSid() {
        return sid;
    }
    
    public void setSid(Long sid) {
        this.sid = sid;
    }
    
    public String getFname() {
        return fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    
    public String getLname() {
        return lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public Long getPhone() {
        return phone;
    }
    
    public void setPhone(Long phone) {
        this.phone = phone;
    }
    
    public Long getGpa() {
        return gpa;
    }
    
    public void setGpa(Long gpa) {
        this.gpa = gpa;
    }
}
