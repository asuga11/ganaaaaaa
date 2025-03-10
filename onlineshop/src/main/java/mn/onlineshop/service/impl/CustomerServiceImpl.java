package mn.onlineshop.service.impl;

import mn.onlineshop.model.entity.Customer;
import mn.onlineshop.repository.CustomerRepositpry;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements mn.onlineshop.service.CustomerService {

    private final CustomerRepositpry customerRepositpry;

    public CustomerServiceImpl(CustomerRepositpry customerRepositpry) {
        this.customerRepositpry = customerRepositpry;
    }

    @Override
    public List<Customer> findByCustomerAddress(String name) {
        return customerRepositpry.findAllByAddress(name) ;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepositpry.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepositpry.save(customer);
    }

    @Override
    public List<Customer> createCustomers(List<Customer> customers) {
        return customerRepositpry.saveAll(customers);
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepositpry.findById(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer findCustomer = customerRepositpry.findById(customer.getId()).orElseThrow();

        findCustomer.setName(customer.getName());
        findCustomer.setEmail(customer.getEmail());
        findCustomer.setPhone(customer.getPhone());
        findCustomer.setAddress(customer.getAddress());
        findCustomer.setCityRegion(customer.getCityRegion());
        findCustomer.setCc_number(customer.getCc_number());

        return customerRepositpry.save(findCustomer);

    }

    @Override
    public String deleteCustomerById(Long id) {
        customerRepositpry.deleteById(id);
        return id+"tai hereglegchiin medeelel ustla";
    }
}
