package com.example.StudentMS.entity;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.Table;
//
////Student.java
////import javax.persistence.Entity;
////import javax.persistence.GeneratedValue;
////import javax.persistence.GenerationType;
////import javax.persistence.Id;
//
//@Entity
//@Table(name="student1")
//public class Student {
// @Id
// @GeneratedValue(strategy = GenerationType.AUTO)
// private Long id;
// public Long getId() {
//	return id;
//}
//public void setId(Long id) {
//	this.id = id;
//}
//private String name;
// private String email;
// private String course;
// @ManyToMany(cascade = CascadeType.ALL)
// @JoinTable(
//         name = "student_role",
//         joinColumns = @JoinColumn(name = "sid"),
//         inverseJoinColumns = @JoinColumn(name = "course_id")
// )
//
// private List<Role> roles;
// 
//
//private List<Role> getRoles() {
//	return roles;
//}
//public void setRoles(List<Role> roles) {
//	this.roles = roles;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public String getEmail() {
//	return email;
//}
//public void setEmail(String email) {
//	this.email = email;
//}
//public String getCourse() {
//	return course;
//}
//public void setCourse(String course) {
//	this.course = course;
//}
//
//public Student(Long id, String name, String email, String course, List<Role> roles) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.email = email;
//	this.course = course;
//	this.roles = roles;
//}
//public Student() {
//	super();
//}
// 
//
// // Constructors, getters, and setters
//}


//package com.example.StudentMS.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String email;
    private String course;
    
    @ManyToMany
//    @JoinTable(
//            name = "student_role",
//            joinColumns = @JoinColumn(name = "id"),
//            inverseJoinColumns = @JoinColumn(name = "rid")
//    )
    private List<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Student(Long id, String name, String email, String course, List<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
		this.roles = roles;
	}

	public Student() {
		super();
	}
    

    // Constructors, getters, and setters

    // Make sure to correct the import statements for the following classes
    // import jakarta.persistence.JoinColumn;
    // import jakarta.persistence.ManyToOne;
    // import jakarta.persistence.ManyToMany;
}

