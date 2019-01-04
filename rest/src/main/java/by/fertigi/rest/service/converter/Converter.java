package by.fertigi.rest.service.converter;


import by.fertigi.common.entity.IEntity;
import by.fertigi.rest.model.IDto;

public interface Converter<E extends IEntity, D extends IDto> {

    D convert(E entity);

    E convert(D dto);
}
