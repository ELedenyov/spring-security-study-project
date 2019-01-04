package by.fertigi.rest.service.converter.impl;

import by.fertigi.common.entity.UserInfo;
import by.fertigi.rest.model.UserInfoDto;
import by.fertigi.rest.repository.UserInfoRepository;
import by.fertigi.rest.service.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoConverter implements Converter<UserInfo, UserInfoDto> {
    private final UserInfoRepository repository;

    @Autowired
    public UserInfoConverter(UserInfoRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserInfoDto convert(UserInfo entity) {
        UserInfoDto dto = new UserInfoDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());

        return dto;
    }

    @Override
    public UserInfo convert(UserInfoDto dto) {
        UserInfo userInfo = new UserInfo();

        userInfo.setId(dto.getId());
        userInfo.setName(dto.getName());
        userInfo.setSurname(dto.getSurname());

        return userInfo;
    }
}
