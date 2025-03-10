package mn.onlineshop.controller;

import mn.onlineshop.model.entity.Customer;
import mn.onlineshop.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/api/customers")
    public List<Customer> getCumtores(){
        return customerService.getAllCustomers();
    }
    @PostMapping("/api/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
    @GetMapping("/api/customer/{id}")
    public Optional<Customer> getCumtomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }
    @PostMapping("/api/customers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers){
        return customerService.createCustomers(customers);
    }

    @PutMapping("/api/customer")
    public Customer editCustomer(@RequestBody Customer customer){
        return  customerService.updateCustomer(customer);
    }

    @DeleteMapping("/api/customer/{id}")
    public String deleteCustomerById(@PathVariable Long id){
        return customerService.deleteCustomerById(id);
    }
}
