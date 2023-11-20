package dosopt.server.eqlserver.api.cart.dto.request;

import lombok.Getter;

@Getter
public class CartAddRequest {
    private long memberId;
    private long itemId;
}
