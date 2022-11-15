package com.technique.mapper;

import com.technique.dto.UserDTO;
import com.technique.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.UUID;

import static org.junit.Assert.assertEquals;


@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class UserMapperTest {


    private UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        User user = User.builder()
                .id(UUID.randomUUID().getMostSignificantBits())
                .username("ericnguyen1606")
                .password("password123")
                .firstName("Nguyen")
                .middleName("The")
                .lastName("Toan")
                .email("ericnguyen1606@gmail.com")
                .phoneNumber("0845684888")
                .address("Danh Thang-Hiep Hoa-Bac Giang")
                .build();
        UserDTO userDTO = userMapper.asDTO(user);
        assertEquals(userDTO.getFirstName(), user.getFirstName());
    }

}
