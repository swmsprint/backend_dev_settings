package sprint.test.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {


    @Id
    private Long id;
    private String password;

    public Member(Long id, String password) {
        this.id = id;
        this.password = password;
    }

    public Member(){

    }
}
