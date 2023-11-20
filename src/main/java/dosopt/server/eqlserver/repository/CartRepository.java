package dosopt.server.eqlserver.repository;

import dosopt.server.eqlserver.domain.Cart;
import dosopt.server.eqlserver.domain.Item;
import dosopt.server.eqlserver.domain.Member;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByMemberAndItem(Member member, Item item);

    List<Cart> findByMember(Member member);
}
