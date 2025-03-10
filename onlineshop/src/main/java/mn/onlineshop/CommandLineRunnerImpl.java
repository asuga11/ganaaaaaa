package mn.onlineshop;

import mn.onlineshop.model.entity.Customer;
import mn.onlineshop.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private CustomerService customerService;

    public CommandLineRunnerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override

    public void run(String... args) throws Exception {
        System.out.println("Hvselt ilgeeh");

        List<Customer> customers = customerService.findByCustomerAddress("Khovd");

        for (Customer customer: customers){
            System.out.println("Name :  " + customer.getName() + " Phone : " + customer.getPhone() + " Address: " + customer.getAddress());
        }
    }
}
