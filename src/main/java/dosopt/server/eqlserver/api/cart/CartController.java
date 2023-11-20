package dosopt.server.eqlserver.api.cart;

import dosopt.server.eqlserver.api.cart.dto.request.CartAddRequest;
import dosopt.server.eqlserver.common.dto.ApiResponse;
import dosopt.server.eqlserver.service.cart.CartQueryService;
import dosopt.server.eqlserver.service.cart.CartService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;
    private final CartQueryService cartQueryService;

    @PutMapping("/add")
    public ApiResponse<?> addItemToCart(@RequestBody final CartAddRequest request, HttpServletResponse response) {
        boolean isItemAlreadyExist = cartService.addItemToCart(request);

        if (isItemAlreadyExist) {
            response.setStatus(HttpServletResponse.SC_OK);
            return ApiResponse.success(HttpStatus.OK, "장바구니의 상품 갯수가 정상적으로 추가되었습니다.");
        }
        response.setStatus(HttpServletResponse.SC_CREATED);
        return ApiResponse.success(HttpStatus.CREATED, "상품이 장바구니에 정상적으로 추가되었습니다.");
    }
}
