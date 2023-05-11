package com.devstack.app.controller;

import com.devstack.app.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerController {

    @RequestMapping("/customer") // localhost:8080/customer
    public String testEndpoint(){
        return "Hello Client, i am the customer here!";
    }


    public String newCustomer(){

    }
    public String findCustomer(){

    }
    public String deleteCustomer(){

    }
    public String findAllCustomers(){

    }
    public String updateCustomer(){

    }
}
