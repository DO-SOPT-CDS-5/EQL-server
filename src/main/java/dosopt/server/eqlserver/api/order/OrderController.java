package dosopt.server.eqlserver.api.order;

import dosopt.server.eqlserver.api.order.dto.response.OrderInfoResponse;
import dosopt.server.eqlserver.common.dto.ApiResponse;
import dosopt.server.eqlserver.service.order.OrderQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderQueryService orderQueryService;

    @GetMapping("order/{memberId}")
    public ApiResponse<OrderInfoResponse> findOrderInfo(@PathVariable("memberId") final Long memberId) {
        return ApiResponse.success(HttpStatus.OK, "주문 정보 조회에 성공했습니다.", orderQueryService.findMemberOrderInfo(memberId));
    }
}
