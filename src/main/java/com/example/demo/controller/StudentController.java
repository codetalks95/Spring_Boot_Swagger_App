package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.response.StudentResponse;
import com.example.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    public StudentService studentService;

    @PostMapping("/savedStudents")
    public StudentResponse saveStudentInfo(@RequestBody StudentEntity entity) {
        return studentService.saveStudentInfo(entity);
    }

    @GetMapping("/findById/{studentId}")
    public StudentResponse getStudentById(@PathVariable Integer studentId) {
        return studentService.getStudentById(studentId);
    }

    @DeleteMapping("/deleteById/{studentId}")
    public StudentResponse deleteStudentById(@PathVariable Integer studentId) {
        return studentService.delStudentById(studentId);
    }

    @PatchMapping("/updatePartialData")
    public StudentResponse savePartialStudentData(@RequestBody StudentEntity entity) {
        return studentService.savePartialData(entity);
    }

    @PutMapping("/updateData")
    public StudentResponse updateData(@RequestBody StudentEntity entity) {
        return studentService.updateData(entity);
    }

    @GetMapping("/findByName/{name}")
    public StudentResponse getStudentById(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @GetMapping("/findBySection/{section}")
    public StudentResponse getStudentBySection(@PathVariable String section) {
        return studentService.findBySection(section);
    }

    @GetMapping("/getSection/{section}")
    public StudentResponse getSection(@PathVariable String section) {
        return studentService.getSection(section);
    }

    @GetMapping("/getName/{name}")
    public StudentResponse getName(@PathVariable String name) {
        return studentService.getSection(name);
    }

    @GetMapping("/findBySchoolName/{schoolName}")
    public StudentResponse getStudentBySchoolName(@PathVariable String schoolName) {
        return studentService.findBySchoolName(schoolName);
    }

    @PatchMapping("/patchData")
    public StudentResponse patchData(@RequestBody StudentEntity entity) {
        return studentService.patchData(entity);
    }

    @PutMapping("/updateNameData")
    public StudentResponse updateName(@RequestBody StudentEntity entity) {
        return studentService.updateName(entity);
    }

}