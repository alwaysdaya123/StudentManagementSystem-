package com.daya.restai.SpringBootRestAPI.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daya.restai.SpringBootRestAPI.entity.Student;

public interface StudentRespository extends JpaRepository<Student, Integer> {

}
