package com.example.crudauthencustomer.Controller;

import com.example.crudauthencustomer.Models.Customer;
import com.example.crudauthencustomer.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class CrudCustomerController {
    private CustomerService employeeService;

//    public CrudCustomerController(CustomerService customerService){
//        employeeService = customerService;
//    }

    @GetMapping("/list")
    public String listEmplyees(Model theModel) {
//        List<Customer> theEmployees = employeeService.findAll();
//
//        theModel.addAttribute("employees", theEmployees);

        return "/employees/list-employees";

    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){

//        Customer theEmployee = employeeService.findById(theId);
//
//        theModel.addAttribute("employee", theEmployee);

        return "/employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Customer theEmployee){
//        employeeService.save(theEmployee);

        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
//        Customer theEmployee = new Customer();
//
//        theModel.addAttribute("employee", theEmployee);

        return "/employees/employee-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId){

//        employeeService.deletebyId(theId);

        return "redirect:/employees/list";
    }

}
