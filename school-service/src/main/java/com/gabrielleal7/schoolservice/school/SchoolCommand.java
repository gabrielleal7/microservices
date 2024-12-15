package com.gabrielleal7.schoolservice.school;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class SchoolCommand {

    private final SchoolRepository repository;

    public School create(School school){
        return repository.save(school);
    }

}
