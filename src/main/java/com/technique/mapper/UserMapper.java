package com.technique.mapper;

import com.technique.dto.UserDTO;
import com.technique.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends GenericMapper<User, UserDTO> {

}
