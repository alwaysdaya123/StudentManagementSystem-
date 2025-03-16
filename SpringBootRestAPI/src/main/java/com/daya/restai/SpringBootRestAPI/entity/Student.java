package com.daya.restai.SpringBootRestAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  int rollNo;
    
    public int getRollNo() {
		return rollNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", brach=" + brach + "]";
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getBrach() {
		return brach;
	}
	public void setBrach(String brach) {
		this.brach = brach;
	}
	@Column(name = "student_name")
    private String name;
    @Column(name = "student_percentage")
    private  float percentage;
    @Column(name = "student_branch")
    private String brach;
   public Student() {
	   
   }
public Student(String name, float percentage, String brach) {
	super();
	this.name = name;
	this.percentage = percentage;
	this.brach = brach;
}
   

}
