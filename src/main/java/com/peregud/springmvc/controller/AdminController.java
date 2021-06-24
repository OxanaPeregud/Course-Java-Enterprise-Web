package com.peregud.springmvc.controller;

import com.peregud.springmvc.model.Admin;
import com.peregud.springmvc.service.AdminService;
import com.peregud.springmvc.util.DataGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private AdminService service;

    @RequestMapping("/add-admin")
    public String addAdmin(Model model) {
        service.save(DataGeneratorUtil.generateAdmin());
        List<Admin> listAdmins = service.listAll();
        model.addAttribute("listAdmins", listAdmins);
        return "admin-table";
    }

    @RequestMapping("/get-admin")
    public String getAdmin(Model model) {
        List<Admin> listAdmins = service.listAll();
        model.addAttribute("listAdmins", listAdmins);
        return "admin-table";
    }
}
