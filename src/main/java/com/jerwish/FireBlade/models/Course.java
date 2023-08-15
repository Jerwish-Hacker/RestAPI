package com.jerwish.FireBlade.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Course {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Id
	    @Column(name = "CID", length = 10, nullable = false)
	    private Long cid;
	    
	    @Column(name = "Title", length = 20, nullable = false)
	    private String title;
	    
	    @Column(name = "Semester", length = 20, nullable = false)
	    private String semester;
	    
	    @Column(name = "Unit", length = 20, nullable = false)
	    private String unit;
	    
	    @Column(name = "Location", length = 20, nullable = false)
	    private String location;
	    
	    @Column(name = "Time", length = 20, nullable = false)
	    private String time;

	    public Course() {
	    }
	    
		public Course(Long cid, String title, String semester, String unit, String location, String time) {
			super();
			this.cid = cid;
			this.title = title;
			this.semester = semester;
			this.unit = unit;
			this.location = location;
			this.time = time;
		}

		public Long getCid() {
			return cid;
		}

		public void setCid(Long cid) {
			this.cid = cid;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSemester() {
			return semester;
		}

		public void setSemester(String semester) {
			this.semester = semester;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	    
	    
	    
}
