package pl.edu.agh.iosr.aws.users.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    // expose id for other calls
    public Integer getUserId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
