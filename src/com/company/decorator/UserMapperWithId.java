package com.company.decorator;

import java.util.Random;

public class UserMapperWithId extends UserMapperDecorator {
    private static final Random RANDOM = new Random();

    public UserMapperWithId(UserMapper mapper) {
        super(mapper);
    }

    @Override
    public User mapDTOToUser(UserDTO userDTO) {
        User user = super.mapDTOToUser(userDTO);
        user.setId(RANDOM.nextLong());
        return user;
    }
}
