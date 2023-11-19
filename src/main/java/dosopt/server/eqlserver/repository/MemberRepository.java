package dosopt.server.eqlserver.repository;

import dosopt.server.eqlserver.domain.Item;
import dosopt.server.eqlserver.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
