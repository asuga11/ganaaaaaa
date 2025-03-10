package mn.onlineshop.repository;

import mn.onlineshop.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepositpry extends JpaRepository<Customer, Long> {
    List<Customer> findByAddress(String name);

    List<Customer> findAllByAddress(String address);
}
