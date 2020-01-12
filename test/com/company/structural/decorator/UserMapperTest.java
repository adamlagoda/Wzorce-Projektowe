package com.company.structural.decorator;

import org.junit.Assert;
import org.junit.Test;

public class UserMapperTest {

    private final UserDTO dto;

    public UserMapperTest() {
        dto = new UserDTO();
        dto.setName("Jan");
        dto.setLastname("Kowalski");
    }

    @Test
    public void whenDecoratorUsedThenIdSet() {
        UserMapper mapper = new UserMapperImpl();

        User user = mapper.mapDTOToUser(dto);
        Assert.assertNull(user.getId());
    }

    @Test
    public void whenPlainMapperUsedThenIdNotSet() {
        UserMapper mapper = new UserMapperImpl();
        UserMapper decorator = new UserMapperWithId(mapper);

        User user = decorator.mapDTOToUser(dto);
        Assert.assertNotNull(user.getId());
    }
}
