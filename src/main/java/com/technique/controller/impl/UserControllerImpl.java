package com.technique.controller.impl;

import com.technique.controller.UserController;
import com.technique.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/user")
@RestController
public class UserControllerImpl implements UserController {


    @Override
    @PostMapping
    public ResponseEntity<UserDTO> addsave(UserDTO user) {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(Long id) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(Long id) {

    }

    @Override
    @GetMapping
    public ResponseEntity<List<UserDTO>> list() {
        return null;
    }

    @Override
    @GetMapping("/page-query")
    public ResponseEntity<Page<UserDTO>> pageQuery(Pageable pageable) {
        return null;
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> update(UserDTO dto, Long id) {
        return null;
    }
}
