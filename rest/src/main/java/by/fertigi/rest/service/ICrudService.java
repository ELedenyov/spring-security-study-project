package by.fertigi.rest.service;

import by.fertigi.common.entity.IEntity;
import by.fertigi.rest.model.IDto;

import java.util.List;

public interface ICrudService<E extends IEntity, D extends IDto> {
    void save(D dto);

    D find(Integer id);

    List<D> findAll();
}
