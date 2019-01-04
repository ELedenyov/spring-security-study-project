package by.fertigi.rest.controller.impl;

import by.fertigi.common.entity.UserInfo;
import by.fertigi.rest.controller.AbstractCrudController;
import by.fertigi.rest.model.UserInfoDto;
import by.fertigi.rest.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController extends AbstractCrudController<UserInfo, UserInfoDto> {

    @Autowired
    public UserInfoController(ICrudService<UserInfo, UserInfoDto> service) {
        super(service);
    }

}