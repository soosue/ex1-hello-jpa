package hellojpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Member {

    @Id
    Long id;

    String name;


}
