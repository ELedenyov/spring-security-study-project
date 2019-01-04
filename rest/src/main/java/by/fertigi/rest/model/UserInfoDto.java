package by.fertigi.rest.model;

import lombok.Data;

@Data
public class UserInfoDto implements IDto {
    private Integer id;
    private String name;
    private String surname;
}
