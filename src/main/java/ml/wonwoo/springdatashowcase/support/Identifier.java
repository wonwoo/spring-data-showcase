package ml.wonwoo.springdatashowcase.support;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@MappedSuperclass
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class Identifier implements Serializable {

    @Column(unique = true)
    private final String id;

    public Identifier() {
        this.id = UUID.randomUUID().toString();
    }

    public String getIdentifier() {
        return id;
    }
}
