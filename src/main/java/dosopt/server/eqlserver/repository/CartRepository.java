package dosopt.server.eqlserver.repository;

import dosopt.server.eqlserver.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
