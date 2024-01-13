package com.example.StudentMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentMS.entity.Role;
import com.example.StudentMS.entity.Student;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByRoleName(String string);

}
