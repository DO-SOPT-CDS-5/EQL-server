package dosopt.server.eqlserver.service.cart;

import dosopt.server.eqlserver.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CartQueryService {
    private final CartRepository cartRepository;

}
