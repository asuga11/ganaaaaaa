package mn.onlineshop.service;

import mn.onlineshop.model.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    List<Customer> findByCustomerAddress(String name);

        List<Customer> getAllCustomers();


        // Нэг хэрэглэгчийн мэдээлэл хадгалах
        public Customer createCustomer(Customer customer);

        // Олон хэрэглэгчийн мэдээлэл хадгалах
        List<Customer> createCustomers(List<Customer> customers);

        // ID-аар хэрэглэгч авах
        public Optional<Customer> getCustomerById(Long id);

        // Хэрэглэгчийн мэдээлэл засварлах
        public Customer updateCustomer(Customer customer);

        // ID-аар хэрэглэгч устгах
        public String deleteCustomerById(Long id);


}
