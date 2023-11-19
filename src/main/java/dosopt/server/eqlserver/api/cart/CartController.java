package dosopt.server.eqlserver.api.cart;

import dosopt.server.eqlserver.service.cart.CartQueryService;
import dosopt.server.eqlserver.service.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    private final CartQueryService cartQueryService;
}
