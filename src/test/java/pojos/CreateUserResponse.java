package pojos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateUserResponse extends UserRequest{
    private String createdAt;
    private String id;
}
