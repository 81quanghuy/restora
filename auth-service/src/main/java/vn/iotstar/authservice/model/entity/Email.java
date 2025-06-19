package vn.iotstar.authservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import vn.iotstar.utils.AbstractMappedEntity;
import vn.iotstar.authservice.util.Constants;

import java.io.Serializable;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = Constants.EMAIL_TABLE)
public class Email extends AbstractMappedEntity implements Serializable {
    @Id
    private String id;
    private String email;
    private String otp;
    private LocalDateTime expirationTime;
}
