package com.gabrielleal7.schoolservice.school.web;

import com.gabrielleal7.schoolservice.school.School;
import com.gabrielleal7.schoolservice.school.SchoolCommand;
import com.gabrielleal7.schoolservice.school.SchoolQuery;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/school")
@AllArgsConstructor
@RestController
public class SchoolRestController {

    private final SchoolQuery schoolQuery;

    private final SchoolCommand schoolCommand;

    @PostMapping
    public School addSchool(@RequestBody School school){
        return schoolCommand.create(school);
    }
    @GetMapping
    public List<School> fetchSchools(){
        return  schoolQuery.findAll();
    }
    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id){
        return schoolQuery.findById(id);
    }
}
