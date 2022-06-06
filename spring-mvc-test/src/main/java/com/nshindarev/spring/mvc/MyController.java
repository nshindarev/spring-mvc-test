package com.nshindarev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

        model.addAttribute("employee", new Employee());
        return "askEmpDetailsView";
    }


//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. "+ empName;
//
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("myBru", "my bru");
//
//        return "showEmpDetailsView";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model){
        empName = "Mr. "+ empName;

        model.addAttribute("nameAttribute", empName);
        model.addAttribute("myBru", "my bru");

        return "showEmpDetailsView";
    }
}
