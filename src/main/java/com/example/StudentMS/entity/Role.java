package com.example.StudentMS.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)

	private Integer rid;
	@Column(unique = true)
	private String roleName;
	@ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
	private List<Student> students;
	
	
    public List<Student> getStudents() {
		return students;
	}
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
	public int getRid() {
		return rid;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
//	public Role(int rid, String roleName, List<Student> students) {
//		super();
//		this.rid = rid;
//		this.roleName = roleName;
//		this.students = students;
//	}
	public Role() {
		super();
	}
	

}
