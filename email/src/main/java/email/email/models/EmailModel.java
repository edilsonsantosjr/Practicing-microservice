package email.email.models;

import email.email.enums.StatusEmail;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document
@Getter
@Setter
public class EmailModel {

    @Id
    private String emailId;
    private String userId;
    private String emailFrom;
    private String emailTo;
    private String title;
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

}
