package com.lol.duogo.user.service;

import com.lol.duogo.user.dto.UserDto;
import com.lol.duogo.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserMapper userMapper;
    public void save(UserDto userDto) {
        userMapper.save(userDto);
    }

    public UserDto findById(Long id) {
        return userMapper.findById(id);
    }
    public UserDto findByRefreshToken(String refreshToken) {
        return userMapper.findByRefreshToken(refreshToken);
    }

    public void update(UserDto userDto) {
        userMapper.update(userDto);
    }

    public void updateRefreshToken(UserDto userDto) {
        userMapper.updateRefreshToken(userDto);
    }
}
