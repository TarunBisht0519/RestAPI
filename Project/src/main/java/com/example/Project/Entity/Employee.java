package com.example.Project.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employeeinfo")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="First_Name",nullable=false)
	private String fname;
	@Column(name="Last_Name")
	private String lname;
	@Column(name="EMAIL")
	private String mail;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String fname, String lname, String mail) {
		
		this.fname = fname;
		this.lname = lname;
		this.mail = mail;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}public String getMail() {
		return mail;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	

}
