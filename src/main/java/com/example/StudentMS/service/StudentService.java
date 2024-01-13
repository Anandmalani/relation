
// StudentService.java
package com.example.StudentMS.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentMS.dto.StudentDto;
import com.example.StudentMS.entity.Role;
import com.example.StudentMS.entity.Student;
import com.example.StudentMS.repository.RoleRepository;
import com.example.StudentMS.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
	 @Autowired
    private  StudentRepository studentRepository;
	 @Autowired
    private  RoleRepository roleRepository;

    
    
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
//    @Autowired
//    public StudentService(StudentRepository studentRepository, RoleRepository roleRepository) {
//		super();
//		this.studentRepository = studentRepository;
//		this.roleRepository = roleRepository;
//	}

	public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public StudentDto createStudent(StudentDto studentDto) {
    	Student s1=new Student();
    	s1.setCourse(studentDto.getCourse());
    	s1.setEmail(studentDto.getEmail());
    	
    	s1.setName(studentDto.getName());
    	List<Role> roles = new ArrayList<>();
    	Role userRole = roleRepository.findByRoleName("USER");
    	if (userRole == null) {
    	    userRole = new Role();
    	    userRole.setRoleName("USER");
    	    
    	}
    	roles.add(userRole);
    	s1.setRoles(roles);

//        Role userRole = new Role();
//        userRole.setRoleName("USER");
               studentRepository.save(s1);
        studentDto.setId(s1.getId());
        
        return studentDto;
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        if (studentRepository.existsById(id)) {
            updatedStudent.setId(id);
            return studentRepository.save(updatedStudent);
        }
        return null; // Handle appropriately (throw exception, return error response, etc.)
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
