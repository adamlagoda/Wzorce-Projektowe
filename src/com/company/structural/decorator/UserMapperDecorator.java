package com.company.structural.decorator;

public abstract class UserMapperDecorator implements UserMapper {
    private UserMapper mapper;

    protected UserMapperDecorator(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public User mapDTOToUser(UserDTO userDTO) {
        return mapper.mapDTOToUser(userDTO);
    }
}
