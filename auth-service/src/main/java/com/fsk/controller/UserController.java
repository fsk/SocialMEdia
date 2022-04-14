package com.fsk.controller;

import com.fsk.dto.request.RegisterRequestDTO;
import com.fsk.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    @Operation(summary = "Kullanici girisi icin kullanilan method")
    public ResponseEntity doLogin(String username, String password) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(userService.findByUsernameAndPassword(username, password));
    }

    /*public ResponseEntity register(@RequestBody @Valid RegisterRequestDTO dto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.save(dto))
    }*/

}
