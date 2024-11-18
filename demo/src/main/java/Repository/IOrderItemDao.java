package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.OrderItem;

@Repository
public interface IOrderItemDao extends JpaRepository<OrderItem, Integer>{

}
