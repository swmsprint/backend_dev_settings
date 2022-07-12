package sprint.test.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Info {
    @Id @GeneratedValue
    private Long id;
    private String content;

    @Builder
    public Info(Long id, String content){
        this.id = id;
        this.content = content;
    }

    public Info() {
    }
}
