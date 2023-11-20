package dosopt.server.eqlserver.api.content;

import dosopt.server.eqlserver.api.content.dto.ContentsResponse;
import dosopt.server.eqlserver.common.dto.ApiResponse;
import dosopt.server.eqlserver.service.content.ContentQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ContentController {
    private final ContentQueryService contentQueryService;

    @GetMapping("/contents")
    public ApiResponse<ContentsResponse> findContentInfos() {
        return ApiResponse.success(HttpStatus.OK, "컨텐츠 조회에 성공했습니다.", contentQueryService.findAllContents());
    }
}
