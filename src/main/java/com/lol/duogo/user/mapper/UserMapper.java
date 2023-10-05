package com.lol.duogo.user.mapper;

import com.lol.duogo.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void save(UserDto userDto);
    UserDto findById(Long id);
    UserDto findByRefreshToken(String refreshToken);
    void update(UserDto userDto);
    void updateRefreshToken(UserDto userDto);
}
