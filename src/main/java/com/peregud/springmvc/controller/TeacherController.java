package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Teacher;
import com.peregud.springmvc.service.TeacherService;
import com.peregud.springmvc.util.DataGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService service;

    @RequestMapping("/add-teacher")
    public String addTeacher(Model model) {
        service.save(DataGeneratorUtil.generateTeacher());
        List<Teacher> listTeachers = service.listAll();
        model.addAttribute("listTeachers", listTeachers);
        return "teacher-table";
    }

    @RequestMapping("/get-teacher")
    public String getTeacher(Model model) {
        List<Teacher> listTeachers = service.listAll();
        model.addAttribute("listTeachers", listTeachers);
        return "teacher-table";
    }
}
