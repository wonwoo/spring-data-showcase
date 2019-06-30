package ml.wonwoo.springdatashowcase.support;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

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
