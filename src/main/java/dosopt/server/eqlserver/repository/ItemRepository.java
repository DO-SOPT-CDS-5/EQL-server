package dosopt.server.eqlserver.repository;

import dosopt.server.eqlserver.domain.Content;
import dosopt.server.eqlserver.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
