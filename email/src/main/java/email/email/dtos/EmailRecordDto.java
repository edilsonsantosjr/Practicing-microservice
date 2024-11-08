package email.email.dtos;

public record EmailRecordDto(String userId,
                             String emailTo,
                             String title,
                             String text) {
}
