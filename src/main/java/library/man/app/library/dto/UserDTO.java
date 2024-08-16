package library.man.app.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    public String name;
    public String emailId;
    public String phoneNumber;
}
