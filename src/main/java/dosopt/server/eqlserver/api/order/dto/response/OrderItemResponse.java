package dosopt.server.eqlserver.api.order.dto.response;

import dosopt.server.eqlserver.api.cart.dto.response.CartItemResponse;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class OrderItemResponse {
    private final int totalItemsAmount;
    private final int totalItemsPrice;
    private final List<CartItemResponse> itemSummaries;

    public static OrderItemResponse of(int totalItemsAmount, int totalItemsPrice, List<CartItemResponse> itemSummaries) {
        return OrderItemResponse.builder()
                .totalItemsAmount(totalItemsAmount)
                .totalItemsPrice(totalItemsPrice)
                .itemSummaries(itemSummaries)
                .build();

    }

}
