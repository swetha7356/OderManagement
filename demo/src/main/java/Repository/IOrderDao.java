package Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Order;

@Repository
public interface IOrderDao extends JpaRepository<Order, Integer>{

}
