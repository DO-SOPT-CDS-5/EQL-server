package dosopt.server.eqlserver.domain;

import dosopt.server.eqlserver.domain.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "contents")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Content extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")
    private Long id;

    @Column(name = "content_title", nullable = false, length = 30)
    private String title;

    @Column(name = "content_description", nullable = false, length = 100)
    private String description;

    @Column(name = "tags", nullable = false, length = 30)
    private String tags;
}
