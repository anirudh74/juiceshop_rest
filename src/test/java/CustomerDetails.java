import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class CustomerDetails {

    private String email;
    private String password;
    private String repeatPassword;
    private String securityQuestion;
    private String securityAnswer;

}
