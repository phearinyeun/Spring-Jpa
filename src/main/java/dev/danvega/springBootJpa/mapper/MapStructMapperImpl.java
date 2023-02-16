package dev.danvega.springBootJpa.mapper;

import dev.danvega.springBootJpa.dto.UserDto;
import dev.danvega.springBootJpa.model.User;

public class MapStructMapperImpl implements UserStructMapper{
    @Override
    public UserDto userToUserDto(User user) {
        if (user == null){
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setUserName(userDto.getUserName());
        return userDto;
    }
}
