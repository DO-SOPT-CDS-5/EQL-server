package dosopt.server.eqlserver.repository;

import dosopt.server.eqlserver.domain.Cart;
import dosopt.server.eqlserver.domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
