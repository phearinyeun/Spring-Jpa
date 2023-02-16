package dev.danvega.springBootJpa.mapper;

import dev.danvega.springBootJpa.dto.UserDto;
import dev.danvega.springBootJpa.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserStructMapper {
    UserStructMapper INSTANCE = Mappers.getMapper(UserStructMapper.class);
    //                 UserDto              User
    @Mapping(target = "userName", source = "name")
    UserDto userToUserDto(User user);
}