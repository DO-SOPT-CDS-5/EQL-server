package dosopt.server.eqlserver.api.order.dto.response;

import dosopt.server.eqlserver.api.member.dto.response.MemberResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class OrderInfoResponse {
    private final MemberResponse consumerInfo;
    private final OrderItemResponse orderItemInfo;
}
