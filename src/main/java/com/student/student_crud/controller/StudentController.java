package com.student.student_crud.controller;

import com.student.student_crud.entity.Bca;
import com.student.student_crud.service.BcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class StudentController
{
    @Autowired
    private BcaService bcaservice;

    @GetMapping("/welcome")
    private String welcome()
    {
        return"helloooo";
    }
    @GetMapping("/home/{name}")
    public String we(@PathVariable String name) {
        return "Hiii" + name;
    }

    @GetMapping("/view")
    public List<Bca> view()
    {
        return bcaservice.getAllStu();
    }
    @PostMapping("/save")
    public String s_bca(@RequestBody Bca bca)
    {
        return bcaservice.save_bca(bca);
    }@DeleteMapping("/del/{id}")
public String del_stu(@PathVariable Long id)
{
    return bcaservice.del_stu(id);
}
    @PutMapping("/edit/{id}")
    public Bca edit_stu(@PathVariable Long id,@RequestBody Bca b)
    {
        return bcaservice.edit_stu(id,b);
    }
}