package com.gabrielleal7.schoolservice.school;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class SchoolQuery {

    private SchoolRepository repository;

    public List<School> findAll(){
        return repository.findAll();
    }
    public School findById(int id){
        return repository.findById(id).orElse(null);
    }
}
