package by.fertigi.rest.service.impl;

import by.fertigi.common.entity.UserInfo;
import by.fertigi.rest.model.UserInfoDto;
import by.fertigi.rest.service.AbstractCrudService;
import by.fertigi.rest.service.converter.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoService extends AbstractCrudService<UserInfo, UserInfoDto> {

    @Autowired
    public UserInfoService(
            JpaRepository<UserInfo, Integer> repository,
            Converter<UserInfo, UserInfoDto> converter
    ) {
        super(repository, converter);
    }
}
