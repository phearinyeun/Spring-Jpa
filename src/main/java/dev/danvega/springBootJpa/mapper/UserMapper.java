package dev.danvega.springBootJpa.mapper;

import dev.danvega.springBootJpa.dto.UserDto;
import dev.danvega.springBootJpa.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "age", target = "userAge")
    UserDto carToCarDto(User user);

    @Mapping(source = "userAge", target = "age")
    User carDtoToCar(UserDto userDto);
}