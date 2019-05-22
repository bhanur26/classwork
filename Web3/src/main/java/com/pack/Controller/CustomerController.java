package com.pack.Controller;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pack.model.Customer;

@Controller

@SessionAttributes("customer")
public class CustomerController {

	@RequestMapping(value="/cust/save",method=RequestMethod.GET)
	public String saveCustomerPage(ModelMap model) {
		
		model.addAttribute("customer",new Customer());
		return "custsave";
	}
	
	
	@RequestMapping(value = "/cust/save.do", method = RequestMethod.POST)
    public String saveCustomerAction(
                  @Valid Customer customer,
                  BindingResult bindingResult, Model model) {
          if(bindingResult.hasErrors()) {
        	  return "custsave";
          }
          // logger.info("Returning custSaveSuccess.jsp page");
           model.addAttribute("customer", customer);
           //customers.put(customer.getEmail(), customer);
           return "custSaveSuccess";
    }



}
