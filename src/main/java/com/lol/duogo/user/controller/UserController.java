package com.lol.duogo.user.controller;

import com.lol.duogo.auth.utils.SecurityUtil;
import com.lol.duogo.exception.CustomException;
import com.lol.duogo.exception.ErrorCode;
import com.lol.duogo.user.dto.UserDto;
import com.lol.duogo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    // 유저정보 조회 API
    @GetMapping("/info")
    public UserDto info() {
        final long userId = SecurityUtil.getCurrentUserId();
        UserDto userDto = userService.findById(userId);
        if(userDto == null) {
            throw new CustomException(ErrorCode.NOT_EXIST_USER);
        }
        return userDto;
    }
}
