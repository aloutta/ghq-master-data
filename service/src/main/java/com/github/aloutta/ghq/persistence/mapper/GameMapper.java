package com.github.aloutta.ghq.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GameMapper {
  GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);
}
