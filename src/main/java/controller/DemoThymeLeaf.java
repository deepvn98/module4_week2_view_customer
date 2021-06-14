package controller;


import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;
import service.ICustomer;

import java.util.List;

@Controller
public class DemoThymeLeaf {
    private ICustomer customer = new CustomerService();

    @GetMapping("page1")
    public ModelAndView getListCustomer(){
        List<Customer> customerList = customer.showAll();
        ModelAndView modelAndView = new ModelAndView("page1");
        modelAndView.addObject("list",customerList);
        return modelAndView;
    }

}
