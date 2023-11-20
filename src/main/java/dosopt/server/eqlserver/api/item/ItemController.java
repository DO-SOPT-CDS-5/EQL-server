package dosopt.server.eqlserver.api.item;

import dosopt.server.eqlserver.api.item.dto.response.ItemResponse;
import dosopt.server.eqlserver.common.dto.ApiResponse;
import dosopt.server.eqlserver.service.item.ItemQueryService;
import dosopt.server.eqlserver.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
    private final ItemQueryService itemQueryService;

    @RequestMapping("/item/{itemId}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<ItemResponse> findItemInfo(@PathVariable("itemId") final Long itemId) {
        return ApiResponse.success(HttpStatus.OK, "상품 상세 조회에 성공했습니다.", itemQueryService.findItemById(itemId));
    }
}
