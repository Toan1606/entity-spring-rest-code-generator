package com.technique.mapper;

import java.util.List;

public interface GenericMapper<E, D> {

    E asEntity(D destination);

    D asDTO(E entity);

    List<E> asEntityList(List<D> dtoList);

    List<D> asDTOList(List<E> entityList);
}
