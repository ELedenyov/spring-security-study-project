package by.fertigi.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserAuthorization implements IEntity{
    private Integer id;
    private String login;
    private String password;
    private String email;
}
