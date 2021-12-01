import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SecurityQuestion {
    private int id;
    private String question;
    private String createdAt;
    private String updateAt;

}
