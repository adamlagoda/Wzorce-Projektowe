package com.company.structural.decorator;

public class UserMapperImpl implements UserMapper {
    @Override
    public User mapDTOToUser(UserDTO userDTO) {
        if (userDTO == null)
            return null;
        User user = new User();
        user.setLastName(userDTO.getLastname());
        user.setName(userDTO.getName());
        return user;
    }
}
