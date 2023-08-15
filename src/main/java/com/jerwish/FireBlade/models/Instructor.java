package com.jerwish.FireBlade.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instructor {

	 @GeneratedValue(strategy = GenerationType.AUTO)
	    @Id
	    @Column(name = "iid", length = 10, nullable = false)
	    private Long iid;
	    
	    @Column(name = "Firstname", length = 20, nullable = false)
	    private String firstname;
	    
	    @Column(name = "Lastname", length = 20, nullable = false)
	    private String lastname;
	    
	    @Column(name = "Ranks", length = 20, nullable = false)
	    private String ranks;
	    
	    @Column(name = "Salary", length = 20, nullable = false)
	    private Long salary;
	    
	    @Column(name = "Department", length = 20, nullable = false)
	    private String department;

	    public Instructor() {
	    	
	    }

		public Long getIid() {
			return iid;
		}

		public void setIid(Long iid) {
			this.iid = iid;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getRanks() {
			return ranks;
		}

		public void setRanks(String ranks) {
			this.ranks = ranks;
		}

		public Long getSalary() {
			return salary;
		}

		public void setSalary(Long salary) {
			this.salary = salary;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public Instructor(Long iid, String firstname, String lastname, String ranks, Long salary, String department) {
			super();
			this.iid = iid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.ranks = ranks;
			this.salary = salary;
			this.department = department;
		}
	    
	
	    
	    
}
